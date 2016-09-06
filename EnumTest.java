

public class EnumTest {
	enum color{ Blue, Red, Yellow, }

    public static void main(String [] args)
    {

    	color c = color.Yellow;
    	System.out.print(c);
    	if (color.Yellow == color.Red)
    		System.out.print("Color is red: ");
    	else
    		System.out.print("Color is not red: ");



    }


}