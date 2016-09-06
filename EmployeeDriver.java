//Joseph Mulray April 30 2015 Programming Challenges #1
public class EmployeeDriver {

    public static void main(String [] args)
    {
    	ProductionWorker pw = new ProductionWorker(55,14.25,"Joseph","421234","12/12/2014");
    	System.out.println(pw.getName());
    	System.out.println(pw.getNumber());
    	System.out.println(pw.getDate());
    	System.out.println(pw.getPay());
    	System.out.println(pw.getShift());

    	pw.setDate("01/12/1998");
		pw.setName("Kevin");

		System.out.println();
		System.out.println("Changes made to date and name: ");
		System.out.println();

    	System.out.println(pw.getName());
    	System.out.println(pw.getNumber());
    	System.out.println(pw.getDate());
    	System.out.println(pw.getPay());
    	System.out.println(pw.getShift());


    }


}