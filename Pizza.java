//This program will represent a pizza

public class Pizza
{
	private double cost;				//the cost of the pizza
	private String crust;			//the type of crust
	private int size;					//the diameter in inches
	private int numToppings;		//the number of toppings
	private String toppingList;	//a list of the toppings

	//Constructor creates a 12" Hand-tossed pizza
	public Pizza()
	{
		cost = 12.99;
		crust = "Hand-tossed";
		size = 12;
		numToppings = 0;
		toppingList = null;
	}

	//adds the parameter amount to the cost
	public void setCost (double amount)
	{
		cost += amount;
	}

	//sets the crust type
	public void setCrust (String type)
	{
		crust = type;
	}

	//changes the size of the pizza to the parameter diameter
	public void setSize (int diameter)
	{
		size = diameter;
	}

	//sets the number of toppings to the parameter number
	public void setNumToppings(int number)
	{
		numToppings = number;
	}

	//sets the list of toppings
	public void setToppingList (String newTopping)
	{
		toppingList = newTopping;
	}

	//returns the cost of the pizza
	public double getCost()
	{
		return cost;
	}

	//returns the crust type
	public String getCrust()
	{
		return crust;
	}

	//returns the size of the pizza
	public int getSize()
	{
		return size;
	}

	//returns the number of toppings
	public int getNumToppings()
	{
		return numToppings;
	}

	//returns the list of toppings
	public String getToppingList()
	{
		return toppingList;
	}
}
