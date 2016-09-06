import java.util.*;
import java.io.*;
//Joseph Mulray April 13 2015 pg 544 14
public class PopulationData
{

    public static void main(String [] args) throws IOException
    {
		double total=0;
		double amount=0;

    	ArrayList<Integer> population = new ArrayList<Integer>();

    	File file = new File("USPopulation.txt");
    	Scanner inputFile = new Scanner(file);

    		while(inputFile.hasNext())
    		{
				population.add(inputFile.nextInt());
    		}

    		int num1;
			int num2;

			for(int x=1;x<population.size();x++)
				{
					num1= population.get(x-1);
					num2=population.get(x);
					total+=(num2-num1);
				}

			for(int str: population)
			{
				amount+=str;
			}


			System.out.println("Average Population: " + (amount/population.size()));
			System.out.println("Average Difference: " + (total/population.size()));
    }


}

