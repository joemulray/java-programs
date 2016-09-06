import java.util.Scanner;

public class SwitchExample {

    public static void main(String[] args) {

	int userNum;
	Scanner keyboard = new Scanner(System.in);

	System.out.print("Enter one of the numbers 1 , 2 , or 3: ");
		userNum= keyboard.nextInt();
		switch(userNum)
		{


		case 1:

			System.out.println("one");
				break;

		case 2:

			System.out.println("two");
			break;

		case 3:

			System.out.println("three");
			break;

		}
    }
}
