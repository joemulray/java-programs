import java.util.Scanner;
import java.io.*;

public class FruitList {

    public static void main(String[] args) throws IOException
    {
    	File file = new File("fruitList.txt");
    	Scanner inputFile = new Scanner(file);

    	while(inputFile.hasNext())
    	{
    		String line = inputFile.nextLine();
    		if ((line.charAt(0) == 'b') || (line.charAt(0)== 'm'))
    			System.out.println(line);
    	}
    	System.out.println("");
		System.out.print("Done!");
    }
}
