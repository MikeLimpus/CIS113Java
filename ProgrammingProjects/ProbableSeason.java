/*
 * Jonathan Limpus
 * Chapter 5 programming project
 * Write a program that reads temperature from the keyboard and outputs a
 * "probable" season based on the temperature
 */

import java.util.Scanner;

public class ProbableSeason {
  public static void main(String args[]) {
    int temp = 0;
    Scanner input = new Scanner(System.in);

    System.out.print("Please input a temperature: ");
    temp = input.nextInt();
    if (temp >= -5 || temp <= 110) {
    	System.out.println("Temperature is outside of valid range. Please input a temperature between -5 and 110 F ");
    }
    else {
	    if(temp >= 90) {
	      System.out.println("It's probably summer");
	    }
	    else if(temp >= 70 && temp < 90) {
	      System.out.println("It's probably spring");
	    }
	    else if (temp >= 50 && temp < 70) {
	      System.out.println("It's probably fall");
	    }
	    else if (temp < 50) {
	      System.out.println("It's probably winter");
	    }
    }
  }
}
