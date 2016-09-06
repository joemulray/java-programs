//Joseph Mulray Final Exam May 5 2015.
import java.util.Scanner;

public class CharacterClassProgram {


    public static void main(String [] args)
{
    	Scanner keyboard = new Scanner(System.in);
    	System.out.print("Please Enter a valid course number: ");
		String iD=keyboard.nextLine();


   		if(iD.length()>7)
   		{
   			System.out.println("Invalid");
   			System.exit(0);
   		}

		for(int x=0;x<3;x++)
		{
    		if(Character.isLetter(iD.charAt(x))==false)
    		{
    			System.out.println("Invalid");
    			System.exit(0);
    		}
    		if(Character.isUpperCase(iD.charAt(x))==false)
    		{
    			System.out.println("Invalid");
    			System.exit(0);
    		}
		}
		for(int x=4;x<7;x++)
		{
			if(Character.isDigit(iD.charAt(x))==false)
			{
	    		System.out.println("Invalid");
    			System.exit(0);
			}
		}
		System.out.println("You have entered a valid ID");
}


}