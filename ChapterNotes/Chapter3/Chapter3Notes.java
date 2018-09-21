import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class Chapter3Notes {
    public static void main(String args[]) {
        /* Classes are templates that define features (variables) and 
         * funtions (methods) 
         *
         * Methods define basic functionality of a class 
         * Generally, you shouldn't know how a method works, only what it needs
         * To work 
         * 
         * Objects
         * Variable-like things of a class type
         */

        /*
         * String Class 
         * 
         * The String class is automatically imported into any Java program
         */
         // Only the string class can instantiate like this
        String message1 = "Jabba Programming"; 

         //Object instantiation
        String message2 = new String("Crafton Hills College");

        System.out.println(message1 + " " + message2); 

        /* 
         * String Methods 
         * .length()
         * .toUpperCase()
         * .toLowerCase()
         * .charAt(index)
         * .substring(begin, end)
         */
        System.out.println("# of chars in message1: " + message1.length());
        System.out.println("message1 to uppercase: " + message1.toUpperCase());
        System.out.println("message1 to lowercase: " + message1.toLowerCase());
        System.out.println("The first letter of message1 is " + message1.charAt(0));
        System.out.println("The last letter of message1 is " + message1.charAt(message1.length() - 1));
        System.out.println("The first word of message1 is " + message1.substring(0, 5));
        System.out.println("The second word is " + message1.substring(5, message1.length()));
        
        /*
         * Math Class
         * Math class is automatically imported
         * Also doesn't require an object declared, unusual for java
         * 
         * Methods: 
         * .abs(number)
         * .sqrt(number) 
         * .pow(number, power)
         * .max(number, number)
         * .min(number, number)
         */ 
        System.out.println("The Absolute Value of -98.6: " + Math.abs(-98.6));
        System.out.println("The square root of -98.6: " + Math.sqrt(-98.6));
        System.out.println("2 to the power of 8" + Math.pow(2, 8));
        System.out.println("Larger val between 10 and 20 is " + Math.max(20,10));
        

        /*
         * DecimalFormat Class
         */

        DecimalFormat currency = new DecimalFormat("$0.00");
        double decimalNumber = 5.837956;
        System.out.println(decimalNumber + " formatted into currency is " + currency.format(decimalNumber));

        DecimalFormat percent = new DecimalFormat("0.000%");
        System.out.println(decimalNumber + " formatted into percent is " + percent.format(decimalNumber));

        /* 
         * Random class
         */

        Random generator = new Random(); 
        System.out.println("A random number between 0 & 99: " + generator.nextInt(99));
        
        /* 
         * Scanner Class
         * Allows for user inputs
         */ 
        Scanner keyboard = new Scanner(System.in);

        // Prompt for input
        System.out.println("Please enter a number: " );
        int inputNumber = keyboard.nextInt();

        System.out.println("You entered " + inputNumber);
    }
}