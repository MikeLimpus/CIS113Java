/**
 * Jonathan Limpus
 * Chapter 11 Notes
 * File I/O and Exceptions
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Chapter11Notes {
    public static void main(String args[]) {
        String userInput = " ";
        int[] numberArray = new int[10];
        int index = 0;

        Scanner input = new Scanner(System.in);

        /*
         * Data Validation (error handling)
         * 
         * Basic try/catch block to validate user input and array index
         */

        try {
            System.out.print("Enter a whole number index for the array: "); 
            // Use a string to recieve anything the user enters 
            userInput = input.nextLine();
            /*
             * Attempt to convert the string into an integer
             * If successful, the program will run as normal and 
             * finish the try block
             * If not, it will jump to the catch block
             */
            index = Integer.parseInt(userInput);
            // Attempt to assign a value into the array at the specified index
            numberArray[index] = 30;
            System.out.print("Number Entered.\n");
        }
        catch(NumberFormatException error) {
            System.out.print("Error: Input is not a valid integer.\n");
        }
        //A single try can handle multiple exceptions
        catch(ArrayIndexOutOfBoundsException error) {
            System.out.print("Error: Invalid array index.\n");
        }

        /*
         * File input/output
         * 
         * Fill our array with some numbers 
         */
        for(int i = 0; i < numberArray.length; i++) 
            numberArray[i] = i * 10;
        // File I/o instantiation MUST be done within try/catch block
        try {
            // Create a file object (Doesn't actually create file on disk)
            FileWriter ioFile = new FileWriter("data.txt", false);

            /*
             * Create an output stream (this will actually create file on disk)
             * If data.txt doesn't already exist, it will be created 
             * If it does exist, the boolean arg in FileWriter will determine 
             * it will append data to file (true) or overwrite it (false)
             */
            PrintWriter outStream = new PrintWriter(ioFile);
            // Write data to file
            // outStream.print("Created with jabba\n");
            for(int i = 0; i < numberArray.length; i++) {
                outStream.print(numberArray[i] + "\n");
            }
            // Close the stream with .close()
            outStream.close();

            System.out.print("File written successfully!\n");
        } 
        catch(IOException error) {
            System.out.print(error.getMessage() + "\n");
        }  

        /*
         * Read from the file 
         */
        try {
            // Create a scanner stream object and point it to the desired file
            Scanner inStream = new Scanner(new File("data.txt"));
            System.out.print("Opening a file to read\n");
            while(inStream.hasNext()) 
                System.out.print(inStream.nextInt() + "\n");
            // Close the stream
            inStream.close();
            System.out.print("End of File reached.\n");
        } 
        catch(IOException error) {
            System.out.print(error.getMessage() + "\n");
        }
    }
}