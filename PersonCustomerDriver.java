//Joseph Mulray Lab 9 Apil 28 2015

public class PersonCustomerDriver {

    public static void main(String [] args)
    {
    	Customer c = new Customer("Joseph", "1120 Villanova Ave" , "610-368-8567", 1234567, true);
    	System.out.println("Name: " + c.getName());
    	System.out.println("Address: " + c.getAddress());
		System.out.println("Telephone: " + c.getTelephone());
    	System.out.println("Customer Number: " + c.getCustomerNumber());
    	System.out.println("Mail List: " + c.getList());

    	c.setAddress("4201 Rosemont Ave");
    	c.setList(false);

		System.out.println();
		System.out.println("New address and mail list status");
		System.out.println();

    	System.out.println("Name: " + c.getName());
    	System.out.println("Address: " + c.getAddress());
		System.out.println("Telephone: " + c.getTelephone());
    	System.out.println("Customer Number: " + c.getCustomerNumber());
    	System.out.println("Mail List: " + c.getList());



    }


}