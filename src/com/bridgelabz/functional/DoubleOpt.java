/******************************************************************************
 *  Purpose: Perform the operations of any three numbers.
 *
 *  @author  Rahul Dhanuka
 *  @version 1.0
 *  @since   01-08-2019
 *
 ******************************************************************************/

package com.bridgelabz.functional;
import java.util.Scanner;

import com.bridgelabz.utility.utility;

public class DoubleOpt
{
	public static void main(String args[])
	{
	double a,b,c,value = 0,num;
	{
		 Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the value of a,b,c:");
		 a = sc.nextDouble();
		 b = sc.nextDouble();	
		 c = sc.nextDouble();
		 
	System.out.println(" 1.a + b *c");
	System.out.println(" 2.a * b + c");
	System.out.println(" 3.c + a / b");
	System.out.println(" 4.a % b + c");
	System.out.println(" Enter the Number of operation:");
	num = sc.nextInt();
	value=utility.operation1(a,b,c, num, value);
	System.out.println(value);
	sc.close();
	}
	
	}
}
