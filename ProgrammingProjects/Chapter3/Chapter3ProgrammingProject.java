/*
 * Jonathan Limpus
 * Chapter 3 Programming Project
 * Input a number of quarters, dimes, and nickels, and output the total in the format $x.xx
 */ 

//Class imports
import java.text.DecimalFormat;
import java.util.Scanner;

public class Chapter3ProgrammingProject {
    public static void main(String args[]) {
        //Constant variables
        final double quarter = 0.25, dime = 0.10, nickel = 0.05;
        //Variables
        double amountQuarters = 0.0, amountDimes = 0.0, amountNickels = 0.0; 
        double total = 0.0;
        //Class constructors
        DecimalFormat dollars = new DecimalFormat("$0.00");
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the amount of quarters: ");
        amountQuarters = input.nextDouble();
        System.out.println("Please enter the amount of dimes: "); 
        amountDimes = input.nextDouble(); 
        System.out.println("Please enter the amount of nickels: ");
        amountNickels = input.nextDouble();
        //Calculate the total amount of money to a single floating point variable
        total = (quarter * amountQuarters) + (dime * amountDimes) + (nickel * amountNickels);
        System.out.println("The total is: " + dollars.format(total));

    }
}