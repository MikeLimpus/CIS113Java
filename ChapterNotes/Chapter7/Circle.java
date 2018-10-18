/**
 * Jonathan Limpus
 * Chapter 7 Part 2 Notes 
 */

import java.text.DecimalFormat;

public class Circle {
    //'this' is used to differentiate fields and parameters 
    // Static   -   Indentify a field as 'class level', meaning that a field belongs
    //              to the class and not any particular instance of the class 
    // toString -   A method that outputs private fields of a class. Mostly a means of testing the class

    private double radius,
                circumference,
                area;

    private static int count; // Count the amount of class objects created by this class 

    DecimalFormat formatObject = new DecimalFormat("0.00");

    public Circle() {
        radius = 1.0;
        calculateCircumference();
        calculateArea();
        count++;
    }
    public Circle(double radius) {
        this.radius = radius;
        calculateCircumference();
        calculateArea();
        count++;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getArea() {
        return area;
    }

    public static int getCount() {
        return count;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        calculateCircumference();
        calculateArea();
    }

    // Additional methods 

    private void calculateCircumference() {
        circumference = 2 * Math.PI * radius; //2πr
    }

    private void calculateArea() {
        area = Math.PI * Math.pow(radius, 2); //πr^2
    }

    public String toString() {
        return "Radius: " + radius + "\nCircumference: " + formatObject.format(circumference) + "\nArea: " + formatObject.format(area); 
    }
}