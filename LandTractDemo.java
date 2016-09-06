import java.util.Scanner;

//Joseph Mulray March 19 user enters the dimentions of two tracks of land and displays the area of each track
// and indicates whether the tracts are of equal size

public class LandTractDemo {

    public static void main(String [] args)
    {
    	Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter the first land track: ");
    	System.out.print("Enter the length: ");
    	double length1=keyboard.nextDouble();

    	System.out.print("Enter the width: ");
    	double width1 = keyboard.nextDouble();

    	LandTract l = new LandTract(length1, width1);

    	System.out.println("Track 1 Area: " + l.getArea());

    	System.out.println("Enter the second land track: ");
    	System.out.print("Enter the length: ");
    	double length2=keyboard.nextDouble();

    	System.out.print("Enter the width: ");
    	double width2 = keyboard.nextDouble();

    	LandTract l2 = new LandTract(length2, width2);

    	System.out.println("Track 2 Area: " + l2.getArea());

		if(l.equals(l2))
			System.out.println("Both Landtracks are the same. ");
		else
			System.out.println("Landtracks are the different. ");



    }


}