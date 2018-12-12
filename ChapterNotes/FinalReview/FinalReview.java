import java.util.ArrayList;

public class FinalReview {
    public static void main(String args[]) {
        /*
         * Chapter 8 
         * 
         * Array - A structure of data of the same type
         * Element - A single variable or object in an array
         * Index - The specific location of an element 
         * 
         * Arrays must have a specific size (number of elements)
         * Arrays by default always start at index 0 and end at n - 1 where n is 
         * the length
         */

         boolean boolArray[] = new boolean[10];
         for(int i = 0; i < boolArray.length; i++) {
            boolArray[i] = false;
         }

         /*
          * Chapter 9 
          * Array Lists - ArrayLists do not have a predefined size when declared
          * Think C++ Vector class 
          */

        ArrayList<String> cars = new ArrayList<String>(); 
        cars.add("Ford");
        cars.add("Chevy");
        System.out.println("ArrayList: " + cars.get(0));
        for(int i = 0; o < cars.size(); i++) {
            System.out.println("ArrayList: " + cars.get(i));
        }
        // Multidimensional arrays
        // There is no limit to the number of dimensions you can have

        int[][] multiNumArray = new int[20][20];    // 20 rows and 20 columns

        /**
         * Chapter 10 
         * Inheritance and polymorphism
         * 
         * Inheritance - The use of multiple classes where at least one is a parent (general class) 
         *               and at least one child class
         * Polymorphism - The use of methods that share the same name 
         * Overriding - If the method names and parameter are the same, that is known as overriding
         * 
         * Abstract -   this refers to a class that cannot have objects instantiated from it
         *              This is generally done to parent classes that are not meant to be used alone
         * extends -    keyword identifying a class as a child. for example: public class ClassName extends ClassName2
         * protected -  keyword defining a variable as viewable only by child classes and the class itself
         * super()   -  calls and accesses parent methods and fields. For example, super.toString();
         */

        /**
         * Chapter 11 - Exception handlers and File IO 
         * 
         * Exception - A runtime error that is handled in code 
         */
        try {
            // Run code may encounter an issue
        }
        catch(NumberFormatException error) {
            // Code to be run if an error occurs
        }
        // You can have as many catches linked to a single try as you'd like 

        // File I/O objects must be instantiated within try/catch block 

        // File object - defines the file name and whether it will append/overwrite
        // Stream object - pathway that allows you to read or write to the file
        // FileWriter ioFile = new FileWriter("data.txt", false);

        // When reading data from a file, use a while loop similar to 
        while(inStream.hasNext())   //.hasNext will run so long as there's something in the file to read  
            System.out.println(inStream.nextInt());

        /**
         * Graphics (Chapters 4 & 12) - GUI 
         * 
         * JFrame - Window
         * JPanel - A "sub-section" within a frame that groups objects like buttons and labels 
         * Listener - Is an object and method that allows for interactivity such as clicking and typing 
         * 
         * Applet - These are old programs that used to be used by integrating them into HTML code 
         * 
         * Swing package contains all the classes for graphics 
         */
    }
    public static void sort(int numArray[]) {
        // This method accepts an array parameter
    }
}