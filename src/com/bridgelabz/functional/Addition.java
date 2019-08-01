/****************************************************************************** 
 *  Purpose: Addition of 2 integers
 *
 *  @author  Rahul Dhanuka
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.functional;

import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class Addition {

public static void main(String args[]) {

			Scanner scanner = new Scanner(System.in);
			utility utility = new utility();
			int firstNumber, secondNumber, resultOfSum;
			System.out.println("We need to add 2 numbers");

			System.out.println("Enter your first number");
			firstNumber = scanner.nextInt();

			System.out.println("Enter your second number");
			secondNumber = scanner.nextInt();

			resultOfSum = utility.additionOfNumbers(firstNumber, secondNumber);
			System.out.println("Addition of the 2 numbers are: " + resultOfSum);

			scanner.close();
}
}