import java.util.*;
import java.io.*;
public class ArrayListExample {

    public static void main(String [] args)
    {

    	Scanner keyboard = new Scanner(System.in);
    	ArrayList<String> names = new ArrayList<String>();

		for(int x=0;x<5;x++)
		{
    	System.out.print("Enter a name: " );
    	String tempName =keyboard.nextLine();
    	names.add(tempName);
		}
		for(String str : names)
			System.out.println(str);

		int count=-1;
		for(String str : names)
		{
			count++;
			if(str.compareTo("Joe")==0)
			{
				System.out.print("Your name was found at index: " + count);
			}
		}

		names.set(4,"Megan");
		names.remove(0);

		System.out.println();

		System.out.println(names);
    }


}