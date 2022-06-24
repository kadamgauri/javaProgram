package javaseissions;

import java.util.Scanner;

public class ConditionalOperator {

	public static void main(String[] args) {
		//1. Take three numbers from the user and print the greatest number. 

				//Test Data
				//Input the 1st number: 25 
				//Input the 2nd number: 78 
				//Input the 3rd number: 87
				//Expected Output : The greatest: 87
			
			int number1 = 25;
			int number2 = 78;
			int number3 = 87;
			{
			if (number1>number2 && number1>number3)
			{
			System.out.println("The greatest:"+ number1);
			}
			else if (number2>number3 && number2>number1)
			{
			System.out.println("The greatest:"+ number2);
			}
			else
			{
			System.out.println("The greatest:"+ number3);
			}
			}
			
	//2. Write a Java program to test a number is positive or negative.
	//Test Data - Input number: 35 -- positive number , Input number: -11 -- negative number		
			
			Scanner myInt = new Scanner(System.in);
			System.out.println("Enter number");
			
			int mynumber = myInt.nextInt();
			System.out.println(mynumber);
			
			int b = -11;
			{
				if (mynumber>=0)
				{
					System.out.println("Positive number");
				}
				else
				{
					System.out.println("Negative number");
				}
				
			}
			
	//
			
			
	}
}
