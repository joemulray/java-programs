/**Joseph Mulray
 * Programming in Java Test 1
 *February 19 2015
 */

public class AddCalc
 {
 	//Declaring Atrributes
 	private int num1;
 	private int num2;
 	private int num3;
 			int num;
 			int greatest;


    public static void main(String[] args)
    	{
    	}
    	//Creating a Constructor
    public void AddCalc(int n1, int n2, int n3)
    {
    	num1 = n1;
    	num2 = n2;
    	num3 = n3;
    }
    public AddCalc()
    {
    }
    //Declaring methods
    public int getNum1()
    {
    	return num1;
    }
    public int getNum2()
    {
    	return num2;
    }
    public int getNum3()
    {
    	return num3;
    }
    public void setNum1(int n)
    {
    	num1=n;
    }
    public void setNum2(int n)
    {
    	num2=n;
    }
    public void setNum3(int n)
    {
    	num3=n;
    }
    public int performAddition()
    {
    	num= (num1+num2+num3);
    	return num;
    }
    public int getLargest()
	{
		//Testing to see which number is the largest and returning that number when called.
    	if ((num1>num2) && (num1>num3))
    	{
    		greatest= num1;
    	}
    	else if ((num2>num1) && (num2>num3))
    	{
    		greatest= num2;
    	}
    	else if ((num3>num1) && (num3>num2))
    	{
    		greatest = num3;
    	}
		return greatest;
	}


}

