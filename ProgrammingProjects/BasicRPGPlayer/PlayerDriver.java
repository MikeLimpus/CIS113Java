import java.util.Scanner;
public class PlayerDriver {
    public static void main(String main[]) {
        String playerChoice = " ", playerName = " ";
        int healthPoints = 0, strength = 0, endur = 0, speed = 0, stealth = 0,
            magic = 0, recast = 0;
        Scanner in = new Scanner(System.in);
        // Ask for basic Player info
        System.out.println("What is your name?");
        playerName = in.next();
        System.out.println("How much health do you have (Enter a number 1-10)");
        healthPoints = in.nextInt();
        System.out.println();
        // Ask player which class they want to be 
        System.out.println("Which class would you like to play as?\n- Warrior\n- Ranger\n- Mage\n ");
        playerChoice = in.next();
        switch(playerChoice) {
            case "Warrior":
            case "warrior":
                System.out.println("How strong are you? (1-10)");
                strength = in.nextInt();
                System.out.println("How much endurance do you have (1-10");
                endur = in.nextInt();
                Melee warrior = new Melee(playerName, healthPoints, strength, endur);
                warrior.print();
                break;
            case "Ranger":
            case "ranger":
                System.out.println("How fast are you? (1-10)");
                speed = in.nextInt();
                System.out.println("How much stealth do you have (1-10");
                stealth = in.nextInt();
                Ranger ranger = new Ranger(playerName, healthPoints, speed, stealth);
                ranger.print();
                break;
            case "Mage":
            case "mage":
                System.out.println("How much magic do you have? (1-10)");
                magic = in.nextInt();
                System.out.println("How much time do you need to recast? (1-10");
                recast = in.nextInt();
                Mage mage = new Mage(playerName, healthPoints, magic, recast);
                mage.print();
                break;
            default:
                System.out.println(playerChoice + "is not a valid class name.");
        }
    }
}