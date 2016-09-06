import java.text.DecimalFormat;
import java.util.Scanner;
import java.io.*;

public class StatsDemo {

    public static void main(String[] args) throws IOException
    {
    	DecimalFormat x = new DecimalFormat ("0.000");
  		Scanner keyboard = new Scanner(System.in);
		String filename = "Numbers.txt";

  		//System.out.print("Enter a .txt file: ");
  		//String filename = keyboard.nextLine();

		File readFile = new File(filename);
  		Scanner inputFile = new Scanner(readFile);

		FileStats fs = new FileStats(filename);
  		PrintWriter outputFile = new PrintWriter("Results.txt");

  		//System.out.println("Mean: " + x.format(fs.getMean()));
  		//System.out.println("Standart Deviation: " + x.format(fs.getStdDev()) );

  		outputFile.close();

    }
}
