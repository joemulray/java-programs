import java.util.Scanner;
import java.io.*;

public class WorldSeries
{

    public static void main(String [] args) throws IOException
    {
    	File file = new File("tax.txt");
    	Scanner inputFile = new Scanner(file);

		PrintWriter fs = new PrintWriter("monthTotal.txt",true);


		double total=0;


		while(inputFile.hasNext())
		{
		total= total+inputFile.nextDouble();
		}
		System.out.print("Total: " + total);

		fs.println(total);
		fs.close();
   }


}
