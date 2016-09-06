import java.util.Random;
import java.util.Scanner;

public class random {

    public static void main(String[] args)
    	 {
    	Scanner keyboard = new Scanner (System.in);
    	Random rand = new Random();
    	int randNum;
    	int number;

    	System.out.print("Enter a number between 1 and 5: ");
    	number = keyboard.nextInt();

    	randNum = rand.nextInt(5)+1;

    	System.out.print("Random Number: " + randNum);

    	if (number == randNum)
    		System.out.print("Congradulations you won!");


    	if (number!= randNum)
    		System.out.print("Sorry you did not win");


    	if (number<0 && number>5)
    		System.out.print("Error user input not in range program terminated.");

    }
}
