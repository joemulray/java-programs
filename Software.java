/**Joseph Mulray
 *Homework #4
 *January 10 2015**/


public class Software {
	int quantity;
	double discount;
	int price;
	double total;
	double newTotal;

public int getQuantity()
{
	quantity=45;
	return quantity;
}

	public double getDiscount()
	{


    	 	if (quantity>=10 && quantity<=19)
    	 	{
    	 		discount = .2;
    	 		return discount;
    	 	}
    	 	else if (quantity>=20 && quantity<=49)
    	 	{
    	 		discount = .3;
    	 		return discount;
    	 	}
    	 	else if (quantity>=50 && quantity<=99)
    	 	{
    	 		discount = .4;
    	 		return discount;
    	 	}
    	 	else if (quantity>=100)
    	 	{
    	 		discount = .5;
    	 		return discount;
    	 	}
				return discount;
			}
	public int getPrice()
	{
		price=99;
		return price;
	}

    public double total()
    {
		total = (price- (price*getDiscount()));
    		return total;
    }



}