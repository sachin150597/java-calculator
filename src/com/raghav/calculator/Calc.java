// Specifying the PACKAGE-NAME for the class
package com.raghav.calculator;

// Import the Scanner class from the java.util Java package to read input values
import java.util.Scanner;

//Defining the CLASS-NAME "Calc" for the above specified package
public class Calc {
	
	// Writing the 4 public methods for each arithmetic operations
	public static int SUM(int num1, int num01) {				// 1. method to perform addition operation.
		return num1 + num01;
	}

	public static int SUBTRACT(int num2, int num02) {			// 2. method to perform subtraction operation.
		return (num2 - num02);
	}

	public static int MULTIPLY(int num3, int num03) {			// 3. method to perform multiplication operation.
		return num3 * num03;
	}

	public static double DIVIDE(double num4, double num04) {	// 4. method to perform division operation.
		if (num04 == 0) {
			System.out.println("=====>>>>> Number Cannot be divided by a zero. So, returing a 0.");
            return 0;
        } else {
        	return num4 / num04;
        }
	}
	

	// Writing the MAIN method where the actual program execution is being done
	public static void main(String[] args) {
		
		// Creating a Scanner object to read inputs from the user-console
		Scanner scan01 = new Scanner(System.in);

		// reading the first value from the user-console
		System.out.println("a) Please enter the Ist number: ");
		int n1 = scan01.nextInt();
		
		// reading the second value from the user-console
		System.out.println("b) Please enter the IInd number: ");
		int n2 = scan01.nextInt();
		
		// Closing the scanner object to prevent resource leaks
        scan01.close();
        
        // calling methods and printing results/outputs of arithmetic operations one by one.
		System.out.println("1. The Addition of two numbers is :" + SUM(n1, n2));
		System.out.println("2. The Substraction of two numbers is : " + SUBTRACT(n1, n2));
		System.out.println("3. The Multiplication of two numbers is : " + MULTIPLY(n1, n2));
		System.out.println("4. The Division of two numbers is : " + DIVIDE(n1, n2));	
	}
}
