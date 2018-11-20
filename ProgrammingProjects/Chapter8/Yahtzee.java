import java.util.Scanner;

/*
 * Jonathan Limpus 
 * Chapter 8 Programming Project
 * Implement a simplified version of Yahtzee in Java
 */

public class Yahtzee {
    //Global Variables
    static int score;
    public static void main(String args[]) {
        //Function variables
        int playCounter = 2, round = 1;  
        int keepDice;
        Scanner input = new Scanner(System.in);
        //Create 5 Dice objects for player
        Dice[] diceArray = new Dice[5];
        for(int i = 0; i < 5; i++) {
            diceArray[i] = new Dice(); 
            diceArray[i].roll();
        }
        System.out.print("Welcome to Yahtzee! \n");
        do {
        /*
         * Main Game Loop
         * Iterate 3 times
         */
            System.out.println("Round " + round);
            round++;
            for(int i = 0; i < 5; i++) { 
                diceArray[i].printSide();
            }
            System.out.println("\n----------------------------");
            for(int i = 0; i < 5; i++) {
                System.out.print("Dice #" + (i + 1) + " = ");
                diceArray[i].printSide();
                System.out.println();
                System.out.println("Would you like to keep this dice? (0 for yes /1 for no)");
                keepDice = input.nextInt();
                if (keepDice == 0) 
                    diceArray[i].setReroll(false);
                else 
                    diceArray[i].setReroll(true);
            }
            System.out.println();

            //Reroll 
            for(int i = 0; i < 5; i++) {
                if(diceArray[i].getReroll())
                    diceArray[i].roll();
            }
            playCounter--;
        } while(playCounter > 0);
        //Calculate the player's score after main loop is exited 
        scoreCheck(diceArray);
        System.out.println("Thanks for playing! Your score was: " + score + "\n");
    }

    public static void sortArray(Dice arr[]) {
    /*
     * Implement bubble sort for Dice array elements
     * Based on sort method in Chapter 8 notes
     * Accepts array of Dice Objects
     */

    int smallestIndex = 0;
    int temporaryInt = 0; 

    for(int i = 0; i < arr.length; i++) {
        smallestIndex = i;
        for(int j = i + 1; j < arr.length; j++) {
            if (arr[j].getSide() < arr[smallestIndex].getSide()) {
                smallestIndex = j;
            }
        }
        temporaryInt = arr[i].getSide();
        arr[i].setSide(arr[smallestIndex].getSide());
        arr[smallestIndex].setSide(temporaryInt);
        }
    }

    public static boolean fullHouse(Dice arr[]) {
    /*
     * Check if the dice array contains a full house  
     * return a boolean true if it does
     * accepts an array of Dice Objects
     * This solution assumes an array of 5 objects
     */

        //Start by sorting the array
        sortArray(arr);
        //3 layers of logic hell is a VERY jank solution
        if (arr[0].getSide() == arr[1].getSide() && arr[3].getSide() == arr[4].getSide()) {         //First two and last two must equal
            if(arr[2].getSide() == arr[1].getSide() || arr[2].getSide() == arr[3].getSide()) {      //3rd should either equal 2nd or 4th
                if(arr[0].getSide() != arr[5].getSide() && arr[1].getSide() != arr[4].getSide()) {  //1st and 2nd can't equal 4th or 5th
                    return true;
                }
                else {
                    return false;
                }
            } 
            else {
                return false;
            }
        }
        else {
            return false;
        }
    } 

    public static void scoreCheck(Dice arr[]) {
    /* 
     * Function to check array indexes to calculate scores
     * accepts an array of Dice Objects
     */
        int yahtzeeCheck = 0;  // If this = 4, then set score to 50
        sortArray(arr);

        if(fullHouse(arr)) {
            score = 25;
        }
        else { 
            for(int i = 0; i < 4; i++) {
            /*
             * Check array elements i and i + 1 for similarity, 
             * then tally score and add to yahtzee counter 
             */
                int j = i++;    //i + 1th element
                if (arr[i].getSide() == arr[j].getSide()) {
                    score += arr[i].getSide() + arr[j].getSide();
                    yahtzeeCheck++; 
                }
            }
        }
        if (yahtzeeCheck == 4) {
            score = 50;
        }
    }
}