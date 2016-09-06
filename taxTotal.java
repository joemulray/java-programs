import java.util.Scanner;
import java.io.*;

public class taxTotal {

    public static void main(String [] args) throws IOException
    {
    	File file = new File("monthTotal.txt");
    	Scanner inputFile = new Scanner(file);
		double total=0;


		while(inputFile.hasNext())
		{
		total= total+inputFile.nextDouble();
		}

		System.out.print("Total: " + total);

    }


}