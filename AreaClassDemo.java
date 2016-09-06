import java.util.Scanner;

public class AreaClassDemo {

    public static void main(String [] args)
     {
     	Scanner keyboard = new Scanner(System.in);
     	AreaClass a = new AreaClass();

		System.out.print("Enter length of rectangle: ");
		int length = keyboard.nextInt();

		System.out.print("Enter width of rectangle: ");
		int width = keyboard.nextInt();

		System.out.print("Enter radius of circle: ");
		double radius = keyboard.nextDouble();

		System.out.print("Enter a radius of a cylinder: ");
		double r = keyboard.nextDouble();

		System.out.print("Enter height of cylinder: ");
		double height = keyboard.nextDouble();


     	System.out.println("Area of the rectangle: " + a.AreaClass(length, width));
     	System.out.println("Area of the circle: " + a.AreaClass(radius));
     	System.out.println("Area of the cylinder: " + a.AreaClass(r,height));
    }



}