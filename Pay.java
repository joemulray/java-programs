//This program calculates the user's gross pay
import java.util.Scanner;   	//to be able to read from the keyboard

public class Pay {

    public static void main(String[] args) {

// create a Scanner object to read from the keyboard
Scanner keyboard = new Scanner(System.in);

//identifier declarations
double hours;		//number of hours worked
double rate;		//hourly pay rate
double pay;			//gross pay

//display prompts and get input
System.out.print("How many hours did you work? ");
hours=keyboard.nextDouble();
System.out.print("How many hours do you get paid per hour? ");
rate=keyboard.nextDouble();

//calculations
if(hours <=40)
	pay = hours*rate;
else
	pay = (hours-40)* (1.5*rate) + 40 *rate;

//display results
System.out.println("You earned $" + pay);
    }
}
