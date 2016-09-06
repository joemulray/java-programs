//Joseph Mulray Lab 9 Apil 28 2015
public class Customer extends Person {

    	int customerNum;
    	boolean mailList;

    public Customer(String n, String a,String t, int cN, boolean ml)
    {
    super(n,a,t);
	customerNum=cN;
	mailList=ml;
    }
    public int getCustomerNumber()
    {
    	return customerNum;
    }
    public void setCustomerNumber(int n)
    {
    	customerNum=n;
    }
    public boolean getList()
    {
    	return mailList;
    }
    public void setList(boolean l)
    {
    	mailList=l;
    }

}