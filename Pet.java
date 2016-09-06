/**Joseph Mulray
 *pg 186 #1
 *January 29 2015
 **/


public class Pet
{
	private String name;
	private int age;
	private String animal;

	public Pet()
	{
		name = "unknown";
		animal = "unknown";
		age =0;
	}

	public Pet(String pName, String tAnimal, int pAge)
	{
		name = pName;
		animal= tAnimal;
		age = pAge;
	}

	public void setName(String n)
	{
		name = n;
	}
	public String getName()
	{
		return name;
	}
	public void setage(int a)
	{
		age= a;
	}
	public int getage()
	{
		return age;
	}
	public void setanimal(String ani)
	{
		animal = ani;
	}
	public String getanimal()
	{
		return animal;
	}
}