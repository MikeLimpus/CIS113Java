/*
 * Driver class for Player and child classes
 */

// Inheritance - The use of a parent class and one or more child classes

// Polymorphism - Using two methods with the same name 

import sports.BaseballPlayer;
import sports.FootballPlayer;

public class Chapter10Notes {
    public static void main(String args[]) {
        BaseballPlayer bbObject = new BaseballPlayer("Albert Pujols", "Angels", 1200000, 19, 64);
        System.out.println(bbObject.toString());
        FootballPlayer fbObject = new FootballPlayer("Todd Gurley", "Rams", 5000000, 13, 1043);
        System.out.println(fbObject.toString());
    }
}