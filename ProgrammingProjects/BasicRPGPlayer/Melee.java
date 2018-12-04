/*
 * Jonathan Limpus
 * Basic RPG Player
 * Melee.java
 */

public class Melee extends Player {
    private int strength, endurance;

    public Melee() {
        super();
        strength = 1;
        endurance = 1;
    }

    public Melee(String playerName, int healthPoints, int strength, int endurance) {
        super(playerName, healthPoints);
        this.strength = strength;
        this.endurance = endurance;
    }

    public int getStrength() {
        return strength;
    }
    public int getEndurance() {
        return endurance;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    @Override
    public void print() {       
        System.out.println("Name: " + playerName + "\nHP: " + healthPoints);
        System.out.println("Job: Warrior\nStrength: " + strength + "\nEndurance: " + endurance);
    }
}