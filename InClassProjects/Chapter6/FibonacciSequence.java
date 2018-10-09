/*
 * Jonathan Limpus 
 * Chapter 6 in-class project
 */

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String args[]) {
        int fib1 = 0, 
            fib2 = 1,
            fib3 = 0,
            userInput = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many fibonacci numbers would you like? ");
        userInput = keyboard.nextInt();
        System.out.print(fib1 + " " + fib2);

        for(int i = 0; i < userInput; i++) {
            fib3 = fib1 + fib2;
            System.out.print(" " + fib3);
            fib1 = fib2;
            fib2 = fib3;
        }
    }
}