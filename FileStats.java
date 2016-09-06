//Joseph Mulray Lab 5 March 10 2015

import java.io.*;//	To calculate the statistics on a file of numbers
import java.util.Scanner;//needed for scanner object
public class FileStats
{
	private double mean;	//the arithmetic average
	private double stdDev;		//the standard deviation

	//Constructor calls calculateMean and calculateStdDev methods
	//and store the results in the respective instance variables
	public FileStats(String filename) throws IOException
	{
		mean = calculateMean(filename);
		stdDev = calculateStdDev(filename);
	}


	//returns the mean
	public double getMean()
	{
		return mean;
	}


	//returns the standard deviation
	public double getStdDev()
	{
		return stdDev;
	}


	//returns the calculated arithmetic average
	public double calculateMean(String filename) throws IOException//needed for File object
	{
		//ADD LINES FOR TASK 4

		//creating a file object passing in filename
		File file = new File(filename);

		//creating a scanner object passing in file object
		Scanner inputFile = new Scanner(file);

		//declaring local variables
		int counter = 0;
		double amount=0;

		//while loop for reading file until end
	while(inputFile.hasNext())
		{
			//read a double from the file and add the value to accumulator
			amount+=inputFile.nextDouble();
			//increment counter
			counter++;
		}
		//closing file
		inputFile.close();

		//returning mean
		return (amount/counter);
	}


	//returns the calculated standard deviation
	public double calculateStdDev(String filename) throws IOException
	{
		//ADD LINES FOR TASK 5

		//creating a file object passing in filename
		File file = new File(filename);

		//creating a scanner object passing in file object
		Scanner inputFile = new Scanner(file);

		//declaring variables
		int counter = 0;
		double amount=0;
		double diff;

	//while loop for reading file until end
	while(inputFile.hasNext())
			{
			diff=inputFile.nextDouble() - mean;
			amount= Math.pow(diff,2.0);
			counter++;
		}
		//closing file
		inputFile.close();

		//square rooting amount and returning standard deviation
		return Math.pow((amount/counter),.5);
	}
}
