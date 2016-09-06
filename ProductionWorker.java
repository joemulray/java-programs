//Joseph Mulray April 30 2015 Programming Challenges #1
public class ProductionWorker extends Employee
{
	int shift;
	double pay;

    public ProductionWorker(int s, double p, String n, String num, String d)
    {
    super(n,num,d);
	shift=s;
	pay=p;

    }
    public int getShift()
    {
    	return shift;
    }
    public void setShift(int s)
    {
    	shift=s;
    }
	public double getPay()
	{
		return pay;
	}
	public void setPay(int p)
	{
		pay=p;
	}
}