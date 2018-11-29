/* Jonathan Limpus
 * Chapter 10 notes
 * A parent class/base class is a template that contains fields shared
 * among all classes 
 */
package sports;
public abstract class Player {      // Abstract keyword prevents objects to be created from this class
    private String name;
    private String team;

    // Protected fields are visible to child classes 

    protected int salary;

    // Constructors 

    public Player() {
        name = " ";
        team = " ";
        salary = 0;
    }

    public Player(String name, String team, int salary) {
        this.name = name;
        this.team = team;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String team) {
        this.team = team; 
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + " Team: " + team + " Salary: " + salary;
    }
}