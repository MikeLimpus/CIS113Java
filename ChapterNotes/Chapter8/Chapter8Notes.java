import java.util.Random;

/*
 * Jonathan Limpus
 * Chapter 8 Notes 
 */

/*
 * Array -  Arrays allow programmers to group multiple variables of the same type
 *          and or class objects
 * Element - One specific item in the array 
 * Index -  The index is the location of an element within the array.
 *          Array indices always start with 0
 * Arrays are objects and must have a declared type and specified number of elements. 
 */

// -- DECLARING ARRAYS -- // 

public class Chapter8Notes {
    public static void main(String[] args) {

        int[] arraySample = new int[10];    //Integer array with 10 elements and a valid of index range of 0-9

        //Assigning a value to an array element
        arraySample[0] = 15;

        System.out.println("arraySample sub 0 = " + arraySample[0]);

        //A common mistake is to cause an arrayOutOfBounds Exception error 

        //Array declaration with an initializer list (Do not tell num of elements or use new keyword)

        String[] stringArray = {"Snoopy", "Charlie", "Lucy"};

        //For loops and arrays work very well together 

        for (int i = 0; i < arraySample.length; i++) {
            arraySample[i] = 100;
        } 

        for (int i = 0; i < arraySample.length; i++) {
            System.out.println("Array[" + i + "] = " + arraySample[i] );
        } 

        //Testing for equality
        int[] array1 = {10, 20, 30}; 
        int[] array2 = {10, 20, 30};

        if(array1[1] == array2[1])
            System.out.print("they equal");

        boolean equal = false;

        for(int i = 0; i < array2.length; i++) {
            if(array1[i] == array2[i])
                equal = true;
            else { 
                equal = false; 
                break;
            }
        }

        //Array reference

        //The array indentifier without an index references the memory loacation in ram of the first element

        System.out.print("Memory location of the first element in arraySample is: " + arraySample);

        array1 = array2;

        if (array1 == array2)
            System.out.println("the array memory locations are equal");

        //Passing arrays to methods

        search(array1, 30);     //Array is being passed-by-reference to the search method (ie, by memory location)
        System.out.println("Fun example " + array1[3]);
        //Array of objects 
        Circle[] circleArray = new Circle[10];

        circleArray[0] = new Circle(5);
        circleArray[1] = new Circle(10);
        System.out.println("First circle in the array " + circleArray[0].toString());

        /**
         * passing an array to sort
         */

         Random rand = new Random();
         int[] randomArray = new int[10];
         for(int i = 0; i < randomArray.length; i++)
            randomArray[i] = rand.nextInt(30);

        sort(randomArray);
    }

    public static void search(int searchArray[], int searchValue) {
        for(int i = 0; i < searchArray.length; i++)
            if(searchArray[i] == searchValue)
                System.out.println(searchValue + " Was found in the array at index" + i);
    }

    public static void sort(int sortArray[]) {
        int smallestIndex = 0;
        int temporaryInt = 0; 

        for (int outsideIndex = 0; outsideIndex < sortArray.length; outsideIndex++) {
            //Assume that the first element in the array is the smallest number and mark it 
            smallestIndex = outsideIndex;
            for(int insideIndex = outsideIndex + 1; insideIndex < sortArray.length; insideIndex++) {
                /* 
                 * If a smaller number is found, mark its location in the array and continue 
                 * to check future numbers against the newly found number
                 */
                if(sortArray[insideIndex] < sortArray[smallestIndex])
                    smallestIndex = insideIndex;
            }
            System.out.print("Switching " + sortArray[outsideIndex] + " with " + sortArray[smallestIndex]);
            temporaryInt = sortArray[outsideIndex];
            sortArray[outsideIndex] = sortArray[smallestIndex];
            sortArray[smallestIndex] = temporaryInt;
        }

    }
}