// APCS1 Lab Test 1
//
// Prog05.java
//
// Debug Real Number Average
//
// Points: 3
//
////////////////////////////////////////////////////////////////////////////////
// This program is supposeD to compute and display the real NUMBER average of 
// the values stored in variables a, b & c.
//
// Right now the program is full of different types of errors.
// Some compile errors will not show up until other errors are fixed.
// You need to fix ALL of the errors so the program can properly compute and
// display the real number average.
//
////////////////////////////////////////////////////////////////////////////////
// When ALL of the mistakes are corrected, the output should look like this:
//
// The average of 20 and 30 and 50 is 33.333333333333336



public class Prog05
{
	public static void main (String args[])
	{
		/*************************************
		 *  Define and Initialize Variables  *
		 *************************************/
		int a = 20;
		int b = 30;
		int c = 50;
		
		/*********************
		 *  Compute Average  *
		 *********************/
		double avg = (a + b + c) / 3.0;
		
		
		System.out.print("The average of 20 and 30 and 50 is ");
		System.out.print(avg);
	}
}
	
