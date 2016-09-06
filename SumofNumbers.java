//importing scanner
import java.util.Scanner;

/**Joseph Mulray
 *Programming Challenges pg 348 #1*/


public class SumofNumbers {

    public static void main(String[] args)
    	{
    		//declaring variable
    		int total=0;
    		int x;
    		//creating object for keyboard
    		Scanner keyboard= new Scanner(System.in);

			//getting user's input
    		System.out.print("Enter a positive nonzero integer: ");
    		int number = keyboard.nextInt();

			//getting the sum of numbers using user's input
    		for (x=1; x<=number; x++)
    			total=total+x;

			//Printing total
    		System.out.println("Total Sum of Numbers8: " + total);

    }
}
