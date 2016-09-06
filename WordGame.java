/**Joseph Mulray
 *pg 127 Exercise 17
 *January 25 2015
*/
import java.util.Scanner;
public class WordGame {

    public static void main(String[] args) {
	Scanner keyboard = new Scanner(System.in);

    	String name;
    	int age;
    	String city;
    	String college;
    	String profession;
    	String animal;
    	String pet;

    System.out.print("Enter your name: ");
    name = keyboard.nextLine();

	System.out.print("Enter your age: ");
	age = keyboard.nextInt();

	System.out.print("Enter the name of a city: ");
	city = keyboard.nextLine();

	city = keyboard.nextLine();

	System.out.print("Enter the name of a college: ");
	college = keyboard.nextLine();

	System.out.print("Enter a profession: ");
	profession = keyboard.nextLine();

	System.out.print("Enter a type animal: ");
	animal = keyboard.nextLine();

	System.out.print("Enter a pet's name: ");
	pet = keyboard.nextLine();

	System.out.print("There was once a person named " + name + " who lived in " + city +
		". At the age of " + age + ", " + name + " went to college at " + college + ". "
		 + name +" graduated and went back to work as a " + profession + ". Then, " + name + " adopted a(an) "
		 + animal + " named " + pet + ". They both lived happily ever after! ");
    }
}
