/*
 * Jonathan Limpus
 * Chapter 10 notes
 */
package sports;
public class FootballPlayer extends Player { 
    private int touchDowns;
    private int rushingYards;

    // Constructors 

    public FootballPlayer() {
        // The super keyword calls the parent constructor 
        super();
        touchDowns = 0;
        rushingYards = 0;
    }

    public FootballPlayer(String name, String team, int salary, int touchDowns, int rushingYards) {
        super(name, team, salary);
        this.touchDowns = touchDowns;
        this.rushingYards = rushingYards;
    }

    /*
     * Accessors and mutators are the same 
     */


    // Overridden methods are methods with the same name and parameters
    @Override // Optional marker used by java compiler 
    public String toString() {
        return super.toString() + "\nTouchdowns: " + touchDowns + "Rushing Yards: " + rushingYards;
    }
}