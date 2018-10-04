/*
 * Jonathan Limpus
 * Chapter 6 notes
 */

import java.util.Scanner;

public class Chapter6Notes {
    public static void main(String args[]) {
        //Iteration - number of times a loop runs
        //Sentinel - value that stops a loop
        Scanner input = new Scanner(System.in);

        int counter = 0,
        menuChoice = 0,
        starsCount = 0;
        String message = "Jabba Programming";

        /*
         * Looping Structure - while
         * A while loop will only run if the condition is true 
         */

        while(counter <= 10) {
            System.out.print("While loop number: " + counter + "\n");
            counter++;
        }
        /*
         * Looping Structure - Do-while
         * Will run once no matter what, checks condition after
         */
        do {
            System.out.print("\n ===== Menu Options =====\n");
            System.out.print("1 Option 1\n");
            System.out.print("2 Option 2\n");
            System.out.print("3 Option 3\n");
            System.out.print("4 Exit\n");       //Sentinel value 
            System.out.print("Please select an option: ");

            menuChoice = 4;
            //menuChoice = input.nextInt();
            System.out.println();
                if(menuChoice == 1)
                    System.out.print("You chose option 1\n");
                else if(menuChoice == 2)
                    System.out.print("You chose option 2\n");
                else if(menuChoice == 3)
                    System.out.print("You chose option 3\n");
                else if (menuChoice == 4)
                    System.out.print("You chose option 4\nExiting the loop\n");
                else 
                    System.out.print("Please input a valid choice\n");
        } while(menuChoice != 4);

        /*
         * for loops
         * generally used for counting, totalling, averaging, etc.
         * good for things with indexes 
         */

        for(int i = 0; i < 5; i++) {
            System.out.print("For Loop Iteration #" + i +"\n");
        }
        for(int index = 0; index < message.length(); index++) {
            System.out.print(message.charAt(index));
        }
        System.out.println();
        for(int line = 1; line <= 5; line++) {
            System.out.print("Line Number: " + line + "\n");
            for(int number = 1; number <= line; number++) {
                System.out.print(number + " "); 
            }
            System.out.println();
        }
        /*
         * More nested loop structures
         */

        do {
            System.out.print("\nPlease enter the number of stars to print or enter 0 to exit: \n");
            starsCount = Math.abs(input.nextInt());
            
            if(starsCount != 0) {
                for(int i = 0; i < starsCount; i++) {
                    System.out.print("*");
                }
            }
        } while(starsCount != 0);
        
        System.out.print("End of program\n");
    }
}