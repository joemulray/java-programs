import java.util.*;
import java.io.*;
public class Sales Analysis {

    public static void main(String [] args) throws IOException
    {
	 File file = new File("SalesData.txt");
	 Scanner inputFile = new Scanner(file);
	double total=0;
	while(inputFile.hasNext())
	{
	String s = inputFile.nextLine();
	StringTokenizer token = new StringTokenizer(s,",");

	while(token.hasMoreTokens())
	{
		String t = token.nextToken();
		Dobule.parseDouble(t);
		total+=t;

	}
	System.out.println("Weekly Total: " + total);



	}

    }


}