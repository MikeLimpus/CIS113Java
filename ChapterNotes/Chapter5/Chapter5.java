public class Chapter5 {
    public static void main(String args[]) {
        int number1 = 0;
        int number2 = 10;
        boolean flag = false; 
        char letter = 'C';
        String name1 = "John";
        String name2 = "Josh";

        //Decision structure - if
        
        if(number1 == number2) {
		System.out.println("The numbers are equal");
	}
	//Relational and equality checks
	// == equal to
	//!= not equal to
	// < less than
	// <= less than or equal to
	// > greater than
	// >= greater than or equal to 
	
	//If-else structure
	if(number1 < number2) 
		System.out.println("Number 1 is less than number 2");
	
	else 
		System.out.println("Number 1 is not less than number 2");

    

	if(number1 != 100) 
		System.out.println("Number1 does not equal 100");
	
	// Logical Operators 
	//! not -negation 
	//&& and -both conditions must be true 
	//|| or - one condition is true
	if (number1 < 100 && number2 > 0) 
		System.out.println("Both are true");

	//Booleans

	if(flag) 
		System.out.println("Flag is up");
	else 
		System.out.println("Flag is down");
	//Common mistake, don't do this
	if (flag = true)
		//this sets flag to true 
		System.out.printlin("Flag will always be true");

	//Nested if
	if(letter == 'A') 
		System.out.println("Excellent");
	else if (letter == 'B') 
		System.out.println("Good");
	else if (letter == 'C')
		System.out.println("Passed");
	else if (letter == 'D')
		System.out.println("Poor");
	else 
		System.out.println("Failed");

	//Checking for string equality
	if(name1.equals("John"))
		System.out.println("Hi John");
	//or
	if(name1 == "John") 
		System.out.println("Changed in new java");

	//Checking for lexicographic order
	if(name1.compareTo(name2) < 0) 
		System.out.println(name1 + " comes before " + name2);
	else if(name1.compareTo(name2) == 0)
		System.out.println(name1 + " is the same as " + name2);
	else if(name1.compareTo(name2) > 0)
		System.out.println(name1 + " comes after " + name2);
	 
	//Code block - used when you want more than 1 line of code for an if structure 
	if(number1 != number2) {
		System.out.println("Inside the code block");
		String blockMessage = "Block message";
		System.out.println(blockMessage);
	}	

	//The conditional operator - shorthand if-else
	int largest = (number1 > number2) ? number1 : number2;
	System.out.println("Largest = " + largest);

	//Switch

	switch (letter) {
		case 'A' : 
			System.out.println("Switch Excellent");
			break;
		case 'B':
			System.out.println("Switch B");
			break;
		case 'C':
			break;

		default:
			System.out.println("Failed");
	}		
	}
}