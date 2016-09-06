/**
 * Programmer: Class Instructor
 * Date: February 17, 2015
 * Description: This program tests the FunnyCalculator class.
 **/

import java.util.Scanner;

public class AddCalcTest
{
	public static void main(String [] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int number1, number2, number3;

		//Prompts for three numbers
		System.out.print("\nEnter a number: ");
		number1 = keyboard.nextInt();

		System.out.print("Enter another number: ");
		number2 = keyboard.nextInt();

		System.out.print("Enter another number: ");
		number3 = keyboard.nextInt();

		//Creates Calculator object
		AddCalc calc = new AddCalc(number1, number2, number3);

		//Tests all methods in class
		System.out.println("The numbers are: " + calc.getNum1() + " and "
			+ calc.getNum2() + " and " + calc.getNum3());
		System.out.println(calc.getNum1() + " + " + calc.getNum2() + " + "
			+ calc.getNum3() +" = " + calc.performAddition());
		System.out.println("The largest number is: " + calc.getLargestNumber());

		//Prompts for three more numbers
		System.out.println("\nPrompting for another set of numbers!");
		System.out.print("Enter a number: ");
		number1 = keyboard.nextInt();

		System.out.print("Enter another number: ");
		number2 = keyboard.nextInt();

		System.out.print("Enter another number: ");
		number3 = keyboard.nextInt();

		//Sets the three numbers for the object
		calc.setNum1(number1);
		calc.setNum2(number2);
		calc.setNum3(number3);

		//Tests other methods in class
		System.out.println("The numbers are: " + calc.getNum1() + " and "
			+ calc.getNum2() + " and " + calc.getNum3());
		System.out.println(calc.getNum1() + " + " + calc.getNum2() + " + "
			+ calc.getNum3() +" = " + calc.performAddition());
		System.out.println("The largest number is: " + calc.getLargestNumber());
	}
}