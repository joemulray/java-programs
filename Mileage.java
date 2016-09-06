//Joseph Mulray
//Lab 2 January 21st 2015

import java.util.Scanner;
public class Mileage {

    public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
   	double mpg;
   	double miles;
   	double gallons;

	System.out.println("This program will calculate mileage");
	System.out.print("Enter amount of miles driven: ");
	miles = keyboard.nextDouble();

	System.out.print("Enter amount of gallons used: ");
	gallons = keyboard.nextDouble();

	mpg= (miles/gallons);
	System.out.println("Miles per gallon: "+ mpg);

    }
}
