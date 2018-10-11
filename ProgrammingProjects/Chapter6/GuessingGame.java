/*
 * Jonathan Limpus
 * Chapter 6 Programming Project
 * Create a guessing game to guess a number between 1-10
 */

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String args[]) {
        int randomNumber = 0;
        int playerGuess = 0;
        int guessesLeft = 5; 
        int keepPlaying = 1;
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        System.out.println();
        System.out.print("Guessing Game: \nTry and guess a number between 1 and 10\n");
        System.out.print("Press 0 to give up!\n");
        
        do {  
            //Reassign randomNumber and guessesLeft for every iteration to play again
            randomNumber = (rand.nextInt(10) + 1);  
            guessesLeft = 5;

            while(guessesLeft > 0) {
               
                System.out.print("You have " + guessesLeft + " guesses left\n");
                playerGuess = input.nextInt();

                if (playerGuess == randomNumber) {
                    System.out.print("You won!\n");
                    break;
                }
                else if (playerGuess == 0) {
                    System.out.print("You gave up! The number was " + randomNumber + "\n");
                    break;
                }
                else {
                    System.out.print("Guess again!\n");
                    guessesLeft--;
                }
            }
            if (guessesLeft == 0) 
                System.out.print("You lost!\n");
            System.out.print("Would you like to play again? [1 for yes/ 0 for no]: ");
            keepPlaying = input.nextInt();
        } while(keepPlaying == 1);

        System.out.print("Thanks for playing! \n\n\n");
    }
}