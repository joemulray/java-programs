

public class Employee {
   private String name;
   private int idNumber;
   private String department;

  //Contructors
  public Employee();
  {
    name = "unknown";
  	department = "unknown";
  	idNumber = 0;
  	public Employee();
  }
  public Employee(String name,int ID, String dept)
  {
  	name= fName;
  		department=dept;
  			idNumber=ID;
  }
  public void setName(String n)
  {
  	name = n;

  }
  public String getName()
  {
  	return name;
  }
    public void setidNumber(int i)
  {
  	idNumber = i;

  }
  public int getidNumber()
  {
  	return idNumber;
  }
    public void setdepartment(String d)
  {
  	department = d;

  }
  public String getdepartment()
  {
  	return department;
  }
    }
}
