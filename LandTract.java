//Joseph Mulray March 19 LandTrack Class

public class LandTract {

    	double length;
    	double width;

    public LandTract(double l,double w)
    {
    	length=l;
    	width=w;
    }

    public double getArea()
    {
    	return(length*width);
    }

    public String toString()
    {
    	String str= ("Length: " + length + "\nWidth :" + width);
    		return str;
    }

	public boolean equals(LandTract object2)
	{
		boolean status;

		if(length == object2.length && width==object2.width)
			status = true;
		else
			status= false;
		return status;
	}
}


