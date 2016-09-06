//Joseph Mulray Final Exam May 5 2015. Extra Credit
public class SimpleSubClass extends SimpleClass{

	int characterCount;

    public SimpleSubClass(String s)
    {
    	super(s);
    	characterCount=s.length();
    }

	public String toString()
	{
		String message = super.toString();
		message+="\nNumber of Characters:" + characterCount;

		return message;
	}

}