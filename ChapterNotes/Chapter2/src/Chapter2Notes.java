
// Single line comment - brief explanation of code 

/* multi-line comment 
 * these are used for more extensive description 
 */ 
//Class Name
public class Chapter2Notes {
	//Starting point
	public static void main(String[] args) {
		
		// OUTPUT STATEMENTS

		//Outputs and keeps the cursor on the same line
		System.out.print("output statement");

		//Print a blank line
		System.out.println(); 

		//Outputs and moves the cursor to the next line
		System.out.println("println on a new line");

		//VARIABLES - used to numbers, letters and strings 
		
		//Data types
		//int, double, char, String(class), boolean
		
		//Identifiers - Variable names 
			//can only contain letters, nums, and underscores
			//cannot start with a number
			//Identifiers by convention should always start with a lowercase 
			//If you use more than one word, you should use camelCase
		//Variable declartions - creating space in memory

		int number1; 
		int number2, number3, number4;

		int number5 = 0;

		double decimalNumber1;
		double decimalNumber2 = 3.14;

		char letter1;
		char letter2 = 'a';
		char letter3 = 97;  //Outputs a
		
		boolean flag = false;

		String message1 = "Java Programming";

		//Java is case sensitive: The following will all work and are different, 
		//But only one is conventionally correct

		String firstname;
		String firstName;	//This is conventionally correct
		String Firstname;
		String FirstName;

		//Constants are like variable, but their value never changes 
		final double PI = 3.14159; 

		//ASSIGNMENT STATEMENTS
		number1 = 100;
		number2 = number1;
		number3 = number1 + 1;
		number3++;

		//Outputting a variable

		System.out.println(number1);

		//Combining literal strings with variables

		System.out.println("Number 1 = " + number1);
		System.out.println(message1 + " is fun");
		
		//Be very careful when concantentating strings and numbers
		System.out.println("The result is " + 2 + 2); 	//Will output 22
		System.out.println("The result is " + (2 + 2));	//Will output 4


		//Escape sequence - used for console output
			// \n = new line 
			// \t = tab
			// \" = prints a double quote
			// \' = single quote
			// \\


		System.out.println("Name:\tAge:");

		//ARITHMETIC OPERATORS	

		// +, -, /, *, %
		//Order precedence - Parenthesis -> M/D -> A/S and left - right
		//Division with int type doesn't round, it cuts off decimal 

		number1 = 2;
		number2 = 9;

		number3 = number2 / number1;
		System.out.println("The result is " + number3);

		decimalNumber1 = number2 / number1;
		System.out.println("The result is " + decimalNumber1);

		// Type casting ints to doubles preserves the decimal value
		decimalNumber1 = (double)number2/(double)number1; 
		System.out.println("The result is " + decimalNumber1);

		//Type casting chars 
		number1 = (int)letter2;
		System.out.println("The result is " + number1);
		// Modulus is used to get the remainder of division 
		number1 = 2; 
		number3 = number2%number1;
		System.out.println("The result is " + number1);
		

		//Shorthand operator 
			// ++ Add one (Increment operator)
			// -- Subtracted 1 (decrement operator)
			// += Add a certain number to the existing value
			// -= Add a cerain number to the existing value

			System.out.println("The result is " + number1);
			number1++;
			System.out.println("The result is " + number1);
	}
}