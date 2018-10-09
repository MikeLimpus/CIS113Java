/*
 * Jonathan Limpus
 * Chapter 6 In-class project
 */

import java.util.Scanner;
import java.util.Random;
public class Random1 {
    public static void main(String args[]) {
        int count = 0,
            highest = 0,
            lowest = 0,
            randomNum = 0;
            sum = 0,
            average = 0;
        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();

        System.out.print("How many random numbers would you like? ");
        count = keyboard.nextInt();

        /*for(int i = 0; i < count; i++) {
            System.out.print(generator.nextInt(100) + " ");
        }*/

        System.out.print("What is the lowest possible number? ");
        lowest = keyboard.nextInt();

        System.out.print("What is the highest possible number? ");
        highest = keyboard.nextInt();

        for(int i = 0; i < count; i++) {
            randomNum = generator.nextInt(highest - lowest + 1) + lowest;
            System.out.print(randomNum + " ");
            sum += randomNum;
        }

        System.out.println("\nThe sum of all random numbers is: " + sum);

        average = sum / count;
        System.out.print("The rough average of the random numbers is: " + average);
    }
}