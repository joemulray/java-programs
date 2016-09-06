
public class EmployeeDemo
 {

	public static main void (String [] args)
		Employee emp1= new Employee();
		Employee emp2 = new Employee("Pat Jones", 1234, "Computer");

		System.out.print("Info for first employee.")
		System.out.print("Name : " + emp1.getname());
		System.out.print("ID : " + emp1.getidNumber());
		System.out.print("Department : " + emp1.getdepartment());
}