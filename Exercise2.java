import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int number;
    String prefix;

    System.out.print("Enter the course prefix: ");
	prefix = keyboard.nextLine();

	System.out.print
	("Enter the course number: ");
	number = keyboard.nextInt();

	if ((prefix.equalsIgnoreCase("cmsc")) && number == 210)
		System.out.println("That is the correct course prefix and number!");
	else if (number==210)
		System.out.println("The  course prefix is not correct but the course number is correct!");
	else
		System.out.println("The  course prefix is correct but the course number is not correct!");

    }
}
