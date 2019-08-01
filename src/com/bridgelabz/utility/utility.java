/****************************************************************************** 
 *  Purpose: It is a utility class where the logics of all other programs
 *           are written. This is done so that most of the code can be reused.
 *
 *  @author  Rahul Dhanuka
 *  @version 1.0
 *  @since   31-07-2019
 *
 ******************************************************************************/
package com.bridgelabz.utility;

public class utility {

/**
* Purpose: This method is used to add 2 integers
* 
* @param  firstNumber:  the first integer
* @param  secondNumber: the second integer
* @return result:       the addition of 2 integers
*/
public int additionOfNumbers(int firstNumber, int secondNumber) {
return firstNumber + secondNumber;
}



/******************************************************************************
 *  Purpose: In this Utility class there is a logic of operation of three integer numbers.
 *
 *  @author  Rahul Dhanuka
 *  @version 1.0
 *  @since   01-08-2019
 ******************************************************************************/


public static int operation(int a, int b, int c, int num, int value) 
	{
			// TODO Auto-generated method stub
			
		if(num==1)
		{
			
			value=a+b*c;
				
		}
			
			if(num==2)
		{
				
			value=a*b+c;
					
				
		}

			if(num==3)
		{
				
			value=c+a/b;
					
			
		}

			if(num==4)
		{
				
			value=a%b+c;
					
		}
			
			return value;
	}


/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of operation of three Double values.
 *  @author  Rahul Dhanuka
 *  @version 1.0
 *  @since   01-08-2019
/****************************************************************************/		

public static double operation1(double a, double b, double c, double num, double value)
{
			{
				// TODO Auto-generated method stub
				
				if(num==1)
			{
				
				value=a+b*c;
						
			}
				
				if(num==2)
			{
					
				value=a*b+c;
						
					
			}

				if(num==3)
			{
					
				value=c+a/b;
				
					
			}

				if(num==4)
			{
					
				value=a%b+c;
						
			}
				
				return value;
			}

					
}

/*****************************************************************************
 *  Purpose: In this Utility class there is a logic of Leap Year.
 *  @author  Rahul Dhanuka
 *  @version 1.0
 *  @since   01-08-2019
/****************************************************************************/		

				
public static int leapyear(int year)
{



if(year>=1582)
{
boolean leap;
if(year % 4 == 0)
{
    if( year % 100 == 0)
    {
        // year is divisible by 400, hence the year is a leap year
        if ( year % 400 == 0)
            leap = true;
        else
            leap = false;
    }
    else
        leap = true;
}
else
    leap = false;
if(leap)
    System.out.println(year + " is a leap year.");
else
    System.out.println(year + " is not a leap yeexar.");
}
else
{
	System.out.println("Year is less than 1582!!!");
}
return 0;

}}


		
