/*
 * Jonathan Limpus 
 * Chapter 8 Programming Project
 * Dice class to help implement Yahtzeez 
 */

import java.util.Random;

public class Dice {
    //Data members
    private int side;       // Should always equal [1 - 6]
    private boolean reroll; // Determines if the player wants to reroll this die   
    
    //Methods
    Dice() {
        side = 1;
        reroll = false;
    }

    public void roll() {
        Random roller = new Random();
        side = roller.nextInt(5) + 1;
    }

    public int getSide() {
        return side;
    }

    public boolean getReroll() {
        return reroll;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void setReroll(boolean reroll) {
        this.reroll = reroll;
    }

    public void printSide() {
        System.out.print(side + " ");    
    }
}