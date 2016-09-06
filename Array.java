import java.util.Scanner;
import java.io.*;

public class Array {

    public static void main(String [] args) throws IOException
    {
    	Scanner keyboard = new Scanner(System.in);
    	String [] names = new String[5];
    	PrintWriter file = new PrintWriter("array.txt");


		for(int x=0; x<names.length;x++)
		{
			System.out.print("Enter a name: ");
			names[x] = keyboard.nextLine();

		}

    	for (String val : names)
    	{
    		file.println(val);
    	}
		file.close();

		String first= names[0];
		for(int x=1; x<names.length;x++)
		{
			if (first.compareTo(names[x])>0)
				first=names[x];
		}
		System.out.println("The shortest name: " + first);
		}
    }

