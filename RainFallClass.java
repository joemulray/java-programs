import java.util.Scanner;
//Joseph Mulray March 23 2015 RainFall assignment
public class RainFallClass
{
	final int M = 12;
	double [] num = new double[M];
	Scanner keyboard = new Scanner(System.in);


	public RainFallClass()
	{
		for(int x=0;x<12;x++)
		{
			System.out.print("Enter the amount of rainfall" + (x+1) + ": ");
			double amount = keyboard.nextDouble();
			while (num[x]<0)
			{
				System.out.println("Invalid input number must be greater than -1. ");
				System.out.print("Enter the amount of rainfall for " + (x+1) + ": ");
				num[x] = keyboard.nextDouble();
			}

		}
	}


    public double getTotal()
    {
    	double total=0;
    	for (int x=0;x<num.length;x++)
    	{
     		total+=num[x];
    	}
    	return total;
    }
	public double getAverage()
	{
		double average;
		average= getTotal()/num.length;
		return average;
	}
	public String getMost()
	{
		String monthName;
		double most=num[0];
		int month=0;
		for(int x=0;x<num.length;x++)
		{
			if(most<num[x]);
			{
				most=num[x];
				month=x;
			}
		}

		switch(month)
		{
			case 0:
				monthName="January";
				break;
			case 1:
				monthName="February";
				break;
			case 2:
				monthName="March";
				break;
			case 3:
				monthName="April";
				break;
			case 4:
				monthName="May";
				break;
			case 5:
				monthName="June";
				break;
			case 6:
				monthName="July";
				break;
			case 7:
				monthName="August";
				break;
			case 8:
				monthName="September";
				break;
			case 9:
				monthName="October";
				break;
			case 10:
				monthName="November";
				break;
			default:
				monthName="December";
				break;
		}
			return(monthName);
	}

	public String getLeast()
	{
			String monthName;
			double min=num[0];
			int month=0;
		for(int x=0;x<num.length;x++)
		{
			if(min>num[x]);
			{
				min=num[x];
				month=x;
			}

			switch(month)
			{
				case 0:
					 monthName="January";
					break;
				case 1:
					monthName="February";
					break;
				case 2:
					monthName="March";
					break;
				case 3:
					monthName="April";
					break;
				case 4:
					monthName="May";
					break;
				case 5:
					monthName="June";
					break;
				case 6:
					monthName="July";
					break;
				case 7:
					monthName="August";
					break;
				case 8:
					monthName="September";
					break;
				case 9:
					monthName="October";
					break;
				case 10:
					monthName="November";
					break;
				default:
					monthName="December";
					break;
		}

	}
	return(monthName);
	}
}
