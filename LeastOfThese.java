//importing scanner class
import java.util.Scanner;

//Joseph Mulray pg 150 #8
//program displays largest and smallest numbers entered.

public class LeastOfThese {

    public static void main(String[] args)
    	 {
    		//creating an object for the scanner
    		Scanner keyboard = new Scanner(System.in);

    		//declaring and setting values to variables
    		int num=0;
    		int min=0;
    		int max=0;

			//getting user's input
    		System.out.print("Enter a number (Enter -99 to exit): ");
    		num = keyboard.nextInt();
			max=num;
			min=num;

		//testing if number is equal to -99 and if greater than min and max
		while(num!=-99)
    	{
			if (num>max)
    			max=num;
    		else if(num<min)
    			min=num;
			else if (max==-99)
				max=num;
			else if (min==-99)
				min=num;
			else
			{
			System.out.print("Enter a number (Enter -99 to exit): ");
    		num = keyboard.nextInt();
			}
    	}

		//printing maximum and minimum
    	System.out.println("Maximum: " + max);
    	System.out.println("Minimum: " + min);


    }
}
