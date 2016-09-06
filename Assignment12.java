import java.util.Scanner;
public class Assignment12 {

    public static void main(String[] args)
    	{
		Scanner keyboard = new Scanner(System.in);

    	System.out.print("Enter a number: ");
    	int	num1= keyboard.nextInt;
    	System.out.print("Enter another number: ");
    	int num2= keyboard.nextInt;

    	System.out.print("Sum: " + (num1 + num2));

		System.out.print("Do you want to perform operation again? (Y or N): ");
		String answer= keyboard.nextLine;

		while (answer.equalsToIgnoreCase("y"))
		{
				System.out.print("Enter a number: ");
    	int	num1= keyboard.nextInt;
    	System.out.print("Enter another number: ");
    	int num2= keyboard.nextInt;

    	System.out.print("Sum: " + (num1 + num2));

		System.out.print("Do you want to perform operation again? (Y or N): ");
		String answer= keyboard.nextLine;
		}



    }
}
