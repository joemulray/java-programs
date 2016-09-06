import java.util.*;
import java.io.*;
//Joseph Mulray #11 pg 601 4/19/2015
public class SalesAnalysis
{

    public static void main(String [] args) throws IOException
    {
	 File file = new File("SalesData.txt");
	 Scanner inputFile = new Scanner(file);
	 double total=0;
	 int count=0;
	 double finaltotal=0;
	 double greatest=0;
	 double lowest=Integer.MAX_VALUE;
	 int num=0;
	 int num1=0;

	while(inputFile.hasNext())
	{
	String s = inputFile.nextLine();
	StringTokenizer token = new StringTokenizer(s,",");
	count++;

		while(token.hasMoreTokens())
		{
		total+=Double.parseDouble(token.nextToken());
		}

		if(total>greatest)
		{
			greatest=total;
			num=count;
		}

		if (total<lowest)
		{
		lowest=total;
		num1=count;
		}


		finaltotal+=total;

	System.out.println("Week " + count + " Total : "+ total);
	System.out.println("Week " + count + " Average : "+ (total/7));
	total=0;
	}
	System.out.println("Total Sales: "+ finaltotal);
	System.out.println("Average Weekly Sales: "+ (finaltotal/count));
	System.out.println("Highest Week Sales: " + "Week " + num + " with " + greatest );
	System.out.println("Lowest Week Sales: " + "Week " + num1 + " with " + lowest );
	}


}