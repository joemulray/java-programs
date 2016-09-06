/**
 * @(#)NameAgeIncome.java
 *
 * NameAgeIncome application
 *
 * @author
 * @version 1.00 2015/1/19
 */

import java.util.Scanner;

public class NameAgeIncome {
    public static void main(String[] args) {

    	int age;
    	String name;
    	double income;

 Scanner keyboard = new Scanner(System.in);

    	System.out.print("Enter your name: ");
			name=keyboard.nextLine();

  		System.out.print("Enter your age: ");
			age=keyboard.nextInt();

  		System.out.print("Enter your desired income: ");
			income=keyboard.nextDouble();

  		System.out.print("My name is "+ name + ", my age is " + age + " and I hope to earn $" + income + " per year." );

    }
}
