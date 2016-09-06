import java.util.*;
public class PigLatin {

    public static void main(String [] args)
    {
    	Scanner keyboard = new Scanner(System.in);
    	System.out.print("Enter a sentence you wish to turn into Pig Latin: ");
    	String sentence = keyboard.nextLine();



		StringTokenizer str = new StringTokenizer(sentence);
		ArrayList<String> array = new ArrayList<String>(str);

		String temp;
		char temp2;
		while(str.hasMoreTokens())
		{
			temp=str.nextToken();
			System.out.println(temp);
			System.out.println(temp.length());
			for(int x=0; x<(temp.length());x++)

		}


			System.out.println(str.nextToken());

    }
}


