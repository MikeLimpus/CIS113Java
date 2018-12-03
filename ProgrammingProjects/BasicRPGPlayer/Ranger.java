/* 
 * Jonathan Limpus
 * Basic RPG Player
 * Ranger.java
 */

public class Ranger extends Player {
    int speed, stealth;

    public Ranger() {
        super();
        speed = 1;
        stealth = 1;
    }

    public Ranger(String playerName, int healthPoints, int speed, int stealth) {
        super(playerName, healthPoints);
        this.speed = speed;
        this.stealth = stealth;
    }

    public int getSpeed() {
        return speed;
    }
    public int getStealth() {
        return stealth;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setStealth(int stealth) {
        this.stealth = stealth;
    }
}