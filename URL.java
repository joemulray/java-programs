


public class URL {

    public static void main(String [] args)
    {
    	String website = "www.chc.edu";
    	if (website.endsWith("edu"))
    	{
    		System.out.print("Educational website! ");
    	}
    	else
    		System.out.print("Not an Educational website. ");

    	String sentence = "My name is Joseph Mulray";
    	int count=0;
		String s=sentence.toCharArray();

		for(int x=0;s.length;x++)
		{

    	if (sentence.isSpaceChar(s.charAt(x)))
    	{
    		count++;
    	}
		}
    	System.out.print("Number of words: " + count);
    }


}