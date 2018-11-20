/*
 * Jonathan Limpus 
 * Chapter 9 Notes 
 */
import java.util.Scanner; 
import java.util.ArrayList;

public class Chapter9Notes {
    public static void main(String args[]) {
        /*
         * Multidimensional Arrays 
         * 
         * Think of multi arrays as subsets 
         * 1-dimension = a single column of empty buckets, index is like a row heading
         * 2-dimensions = several columns and rows of empty buckets. Similar to a table format
         * 3-dimensions = multiple pages of "table" formats 
         * 
         */

        /* char[][] ttt = new char[3][3];     //Array of 3 x 3 
         int playerRow = 0; 
         int playerColumn = 0;

         Scanner input = new Scanner(System.in);

         // Initialize all array elements to dashes 
        for(int row = 0; row < ttt.length; row++) {
            for(int column = 0; column < ttt[row].length; column++) {
                ttt[row][column] = '-';
                System.out.print(ttt[row][column] + " ");
            }
            System.out.println();
        }

        // Fill in the board 
        for(int round = 0; round < 3; round++) {
            System.out.print("\nPlace your mark at what location? (row/column): ");
            playerRow = input.nextInt();
            playerColumn = input.nextInt();
        }
        */

        /*
         * Array Lists
         * 
         * Used to create lists of items where the total number 
         * of items is unknown 
         */

        ArrayList<String> cars = new ArrayList<String>();

        //Adding Elements 
        cars.Add("Ford");
        cars.add("Chevy");
        cars.add("Tesla");
        cars.add("Inital D car");

        System.out.print("The list has " + cars.size() + " elements \n");
        System.out.print("The first element is : " + cars.get(0));
        System.out.print("The last element is: " + cars.get(cars.size() - 1));

        //Editing elements 
        cars.set(1, "Lambo");

        //Removing elements 
        cars.remove("Initial D Car");
    } 
}