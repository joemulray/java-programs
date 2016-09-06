import java.util.Scanner;
public class ArrayWord {

    public static void main(String[] args)
    {
    	final int WORDS = 5;
    	double [] words = new double [WORDS];
    	Scanner keyboard = new Scanner(System.in);

    	for (int x=0; x<WORDS;x++)
    	{
    		System.out.print("Enter a word: ");
    		words[x]=keyboard.nextDouble();
    	}
    	for(double val:words)
    	{
    		System.out.println(val);
    	}
    }


}