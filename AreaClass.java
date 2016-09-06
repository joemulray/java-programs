

public class AreaClass {


    public static double AreaClass(int l, int w)
    {
    	int length=l;
    	int width=w;

    	return(length*width);
    }
	public static double AreaClass(double r)
	{
		double radius=r;

		return (Math.PI*Math.pow(radius,2));
	}
	public static double AreaClass(double r, double h)
	{
		double radius=r;
		double height=h;

		return(Math.PI*Math.pow(radius,2)*height);
	}
}