import java.util.Scanner;//importing for scanner object
import java.io.*;//importing IO exception

//Joseph Mulray Assignment 14 pg 350 March 10 2015

public class UpperClassFile {

    public static void main(String[] args) throws IOException
    	{


			//Creating file object to read from
			File readFile = new File("lower.txt");
			Scanner inputFile = new Scanner(readFile);

			//creating object for file to write to
			PrintWriter outputFile = new PrintWriter("upper.txt");

			//creating while loop to read from each line in file
			while(inputFile.hasNext())
			{
				//importing text from file and storing in value
				String line = inputFile.nextLine();
				System.out.println(line);

				//uppercasing line and sending into new file.
				String upper = line.toUpperCase();
				outputFile.println(upper);

			}
			//closing both the writing and reading files
			outputFile.close();
			inputFile.close();
    	}

}