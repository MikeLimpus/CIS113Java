public class Mage extends Player {
    int magicPoints, castTime;

    public Mage() {
        super();
        magicPoints = 1;
        castTime = 1;
    }

    public Mage(String playerName, int healthPoints, int magicPoints, int castTime) {
        super(playerName, healthPoints);
        this.magicPoints = magicPoints;
        this.castTime = castTime;
    }

    public int getMP() {
        return magicPoints;
    }
    public int getCastTime() {
        return castTime;
    }
    public void setMP(int magicPoints) {
        this.magicPoints = magicPoints;
    }
    public void setCastTime(int castTime) {
        this.castTime = castTime;
    }
    
    @Override
    public void print() {
        System.out.println("Name: " + playerName + "\nHP: " + healthPoints);
        System.out.println("Job: Mage\nMP: " + magicPoints + "\nRecast " + castTime);
    }
}