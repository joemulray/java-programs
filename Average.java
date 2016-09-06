import java.util.*;


public class Average
{

	Scanner keyboard = new Scanner(System.in);
	private  int [] data = new int[5];
    private double mean;

    public Average()
    {
    	for(int x=0;x<5;x++)
    	{
    		System.out.print("Enter score " + (x+1) + ": ");
    		int tempScore=keyboard.nextInt();
    		data[x]=tempScore;
    	}

    }
    public void calculateMean()
    {
    	double total=0;
    	for(int x: data)
    	{
    		total+=x;
    	}
    	mean=(total/data.length);
    }
    public String toString()
    {
    	String str="Data: ";
    	for(int x: data)
    	{
   		 str+=x + " ";
    	}
    	str+="\nMean: " + mean;

    	return str;
    }
	public  void selectionSort()
	{

		int startScan,index,minIndex,minValue;
		for(startScan=0;startScan<(data.length-1);startScan++)
		{
			minIndex=startScan;
			minValue= data[startScan];
			for(index = startScan+1;index<data.length;index++)
			{
				if(data[index]<minValue)
				{
					minValue=data[index];
					minIndex = index;
				}
			}
			data[minIndex]=data[startScan];
			data[startScan] = minValue;
		}
	}
}