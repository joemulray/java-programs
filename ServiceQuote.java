

public class ServiceQuote
{
	private double	partsCharges;
	private double laborCharges;

	public ServiceQuote()
	{
	}
	public void setPartsCharges(double c)
	{
		partsCharges = c;
	}
	public double getPartsCharges()
	{
		return partsCharges;
	}
	public void setLaborCharges(double c)
	{
		laborCharges = c;
	}
	public double getLaborCharges()
	{
		return laborCharges;
	}
	public double getSalesTax()
	{
		return (partsCharges+laborCharges)*.06;
	}
	public double getTotalCharges()
	{
		return (partsCharges+laborCharges+ getSalesTax());
	}

}
