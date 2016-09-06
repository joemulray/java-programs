import java.util.*;
import java.io.*;

public class SplitExample {

    public static void main(String [] args) throws IOException
    {
    	File file = new File("studentSplit.txt");
    	Scanner inputFile = new Scanner(file);
		String [] t;

    	while(inputFile.hasNext())
    	{
    	String str=inputFile.nextLine();
    	t = str.split(",");
    	System.out.println("Name: " + t[0]);
    	System.out.println("ID: " + t[1]);
    	System.out.println("GPA: " + t[2]);
    	System.out.println("");
   		}
		String highestStudent;
		double highestGPA=0;

		if(Double.parseDouble(t[2])>highestGPA)
		{
			highestGPA=Double.parseDouble(t[2]);
			highestStudent=t[0];
		}
		System.out.print("Highest Student: " + highestStudent + "\nHighest GPA: " + highestGPA);

    }


}