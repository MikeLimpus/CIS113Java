/* 
 * Jonathan Limpus
 * Chapter 7 Lecture Notes
 */

/*
 * Classes- Contain defining features and actions for an abstract thing. 
 *          They are like templates used to create objects
 *
 * Objects - Instances of a class built from the "template"
 * 
 * Field - Defines the features of a class. They act just like variables. (generally private)
 * 
 * Method - Defines the actions of a class. (generally public)
 * 
 * Encapsulation -  Refers to how accessible data and methods are within a class
 *                  Private - Can only be seen by the class that creates it 
 *                  Public - Can be used by any class including outside classes  
 *                  Protected - Can only be used by the class that creates it 
 *                              and other specially defined classes (like in inheritance)
 */
public class Automobile {
    //Fields 
    private String color;
    private String make; 
    private String model;
    private int year;

    public String example; // Avoid using public fields like this 

    /*
     * Methods
     * 
     * Constructors - Special methods used to initialize the values of fields 
     */ 
    
    //Default constructor 
    public Automobile() {
        color = " ";
        make = " ";
        model = " ";
        year = 0;
    }

    //Constructor with a parameter set 
    public Automobile(String pColor, String pMake, String pModel, int pYear) {
        color = pColor;
        make = pMake;
        model = pModel; 
        year = pYear;
    } 

    //Accessor methods - Retrieve private field values 
    public String getColor() {
        return color;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year; 
    }

    //Mutator methods - Change private field values 
    public void setColor(String mColor) {
        color = mColor;
    }

    public void setMake(String mMake) {
        make = mMake;
    }

    public void setModel(String mModel) {
        model = mModel;
    }
    
    public void setYear(int mYear) {
        year = mYear;
    }

}