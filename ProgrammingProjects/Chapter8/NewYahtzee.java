/* 
 * In-class Solution for Yahtzee problem
 */

import java.util.Random;
import java.util.Scanner;

public class NewYahtzee {
    public static void main(String args[]) {
        int[] dice = new int[5];
        int[] keep = new int[5]; 
        int diceTotal = 0;
        int matchingValueHigh = 0;
        int matchingValueLow = 0;
        int numberOfMatchesHigh = 0;
        int numberOfMatchesLow = 0;
        Random generator = new Random();
        Scanner input = new Scanner(System.in);

        // Initialize and play 
        
        // Initialize the 'keep' array 
        for(int k = 0; k < keep.length; k++) {
            keep[k] = 0;
        }

        // Play three rounds of rolling the dice 
        for(int rounds = 0; rounds < 3; rounds++) {
            // Place random numbers in available slots 
            for(int i = 0; i < dice.length; i++) {
                if(keep[i] == 0) 
                    dice[i] = (generator.nextInt(6) + 1);
                System.out.println(dice[i] + " ");
            }

            System.out.println();

            // Ask to keep or reroll each dice 
            if(rounds < 2) {
                for(int i = 0; i < dice.length; i++) {
                    System.out.print("Dice " + (i + 1) + " keep(1) or reroll(0)?");
                    keep[i] = input.nextInt();
                }
            }
        }

        // Check for matches 

        // Find the dice total in case of 3 or 4 of a kind 
        for(int i = 0; i < dice.length; i++) {
            diceTotal += dice[i];
        }

        sort(dice);

        // Find the highest matching value of dice 
        for(int i = 0; i < (dice.length - 1); i++) {
            if(dice[i] == dice[i + 1])
                matchingValueHigh = dice[i];
        }

        //Find the number of matching dice with the highest value 
        for(int i = 0; i < (dice.length - 1); i++) {
            if(dice[i] == dice[i + 1] && dice[i] == matchingValueHigh) {
                numberOfMatchesHigh++;
            }
        }
        // Check for second matching value 

         // Find the lowest matching value of dice 
         for(int i = 0; i < (dice.length - 1); i++) {
            if(dice[i] == dice[i + 1] && dice[i] != matchingValueHigh)
                matchingValueLow = dice[i];
        }

        //Find the number of matching dice with the lowest value 
        for(int i = 0; i < (dice.length - 1); i++) {
            if(dice[i] == dice[i + 1] && dice[i] == matchingValueLow) {
                numberOfMatchesLow++;
            }
        }

        //Determine to see if any higher matches are greater in number than lower matches 
        if(numberOfMatchesHigh > numberOfMatchesLow) {
            switch(numberOfMatchesHigh) {
                case 4:
                    System.out.print("Yahtzee! You scored 50 points!\n");
                    break;
                case 3: 
                    System.out.print("4 of a kind! You scored " + diceTotal + " points\n");
                case 2: 
                    if(numberOfMatchesLow == 1)
                        System.out.print("Full House! You scored 25 points!\n");
                    else
                        System.out.print("3 of a kind! You scored " + diceTotal + " points\n");
                    break;
                case 1:
                    System.out.print("You have a pair of matching dice. You scored " + (matchingValueHigh * 2) + " points\n");
                default:
                    System.out.print("You have no matching dice. You scored " + dice[4] + "points\n");
            }
        }
        else {
            switch(numberOfMatchesLow) {
                case 4:
                    System.out.print("Yahtzee! You scored 50 points!\n");
                    break;
                case 3: 
                    System.out.print("4 of a kind! You scored " + diceTotal + " points\n");
                case 2: 
                    if(numberOfMatchesHigh == 1)
                        System.out.print("Full House! You scored 25 points!\n");
                    else
                        System.out.print("3 of a kind! You scored " + diceTotal + " points\n");
                    break;
                case 1:
                    System.out.print("You have a pair of matching dice. You scored " + (matchingValueHigh * 2) + " points\n");
                default:
                    System.out.print("You have no matching dice. You scored " + dice[4] + "points\n");
            }
        }


    }

    public static void sort(int sortArray[]) {
        int smallestIndex = 0;
        int temporaryInt = 0; 

        for (int outsideIndex = 0; outsideIndex < sortArray.length; outsideIndex++) {
            //Assume that the first element in the array is the smallest number and mark it 
            smallestIndex = outsideIndex;
            for(int insideIndex = outsideIndex + 1; insideIndex < sortArray.length; insideIndex++) {
                /* 
                 * If a smaller number is found, mark its location in the array and continue 
                 * to check future numbers against the newly found number
                 */
                if(sortArray[insideIndex] < sortArray[smallestIndex])
                    smallestIndex = insideIndex;
            }
            System.out.print("Switching " + sortArray[outsideIndex] + " with " + sortArray[smallestIndex]);
            temporaryInt = sortArray[outsideIndex];
            sortArray[outsideIndex] = sortArray[smallestIndex];
            sortArray[smallestIndex] = temporaryInt;
        }

    }
}
