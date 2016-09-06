/**Joseph Mulray
 *February 15 Dice Program*/


//Importing random for dice simulation
import java.util.Random;

public class Dice {

    public static void main(String[] args) {
//Declaring object
    	Random randNum = new Random();

//Generating rolling two dice
    int random =randNum.nextInt(6)+1;
   int random2 = randNum.nextInt(6)+1;

//Printing random numbers
	System.out.println("Dice 1: " + random);
	System.out.println("Dice 2: " + random2);

//Testing random numbers to see if user wins
    if (random==random2)
   			 if (random==1)
     	    	System.out.print("Snake eyes! You win $100.00!");
     	    else
     	    	System.out.print("Doubles, you win $10.00!");
    else
    	System.out.print("Sorry you did not win.");

    }
}
