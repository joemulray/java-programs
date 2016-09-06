

public class ETest {
	enum color{ Blue, Red, Yellow, }

    public static void main(String [] args)
    {

    	color c = color.Yellow;
    	System.out.println(c);
    	System.out.println(c.ordinal());
    	if (c.equals(c.Red))
    		System.out.print("Color is red: ");
    	else
    		System.out.print("Color is not red: ");



    }


}