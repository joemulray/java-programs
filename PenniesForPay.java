//importing scnaner and format for user input and currency formatting
import java.util.Scanner;
import java.text.DecimalFormat;

//Joseph Mulray pg 349 #4 Pennies for Pay
public class PenniesForPay {

    public static void main(String[] args)
    	{
    	//Declaring variables
    	int days;
		double pay=.01;
		double totalpay=.01;

		//creating object for scanner and format
    	Scanner keyboard = new Scanner(System.in);
    	DecimalFormat money = new DecimalFormat("$#,000.00");

		//getting user's input on how many days were worked and storing value in days
    	System.out.print("How many days did you work? (Salary starts at $0.01 and doubles everyday): ");
    	days = keyboard.nextInt();

		//while loop for inputs lower than one and reprompts the user
    	while(days<1)
    	{
    	System.out.println("Invalid amount of days");
    	System.out.print("How many days did you work? (Salary starts at $0.01 and doubles everyday): ");
    	days = keyboard.nextInt();
    	}

		//doubling pay and adding each in total while days is greater than zero
		while((days-1)>0)
		{
			pay*=2;
			totalpay+=pay;
			days--;
		}
		//printing total salary earned by user
		System.out.print("Total pay: " + money.format(totalpay));
    }
}
