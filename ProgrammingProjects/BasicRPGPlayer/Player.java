/*
 * Jonathan Limpus
 * Basic RPG Player
 * Player.java
 */

public abstract class Player {
    protected String playerName;
    protected int healthPoints;

    public Player() {
        // Set default values
        playerName = "Name";
        healthPoints = 10;
    }

    public Player(String playerName, int healthPoints) {
        this.playerName = playerName;
        this.healthPoints = healthPoints;
    }

    // Accessors and Mutators
    public String getName() {
        return playerName;
    }
    public int getHealth() {
        return healthPoints;
    }
    public void setName(String playerName) {
        this.playerName = playerName;
    }
    public void setHealth(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void print() {
        System.out.println("Name: " + playerName + "\nHP: " + healthPoints);
    }

    
}