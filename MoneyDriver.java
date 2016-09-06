//This program tests the money class.

public class MoneyDriver
{
	//This is a driver for testing the class
	public static void main(String[] args)
	{
		final int BEGINNING = 500;
		final Money FIRST_AMOUNT = new Money(10.02);
		final Money SECOND_AMOUNT = new Money(10.02);
		final Money THIRD_AMOUNT = new Money(10.88);
		Money balance = new Money(BEGINNING);
		System.out.println("The current amount is " +
			balance.toString());
		balance = balance.add(SECOND_AMOUNT);
		System.out.println("Adding " + SECOND_AMOUNT +
			" gives " + balance.toString());
		balance = balance.subtract(THIRD_AMOUNT);
		System.out.println("Subtracting " + THIRD_AMOUNT +
			" gives " + balance.toString());
		boolean equal = SECOND_AMOUNT.equals(FIRST_AMOUNT);
		if(equal)
			System.out.println(SECOND_AMOUNT + " equals "
				+ FIRST_AMOUNT);
		else
			System.out.println(SECOND_AMOUNT +
				" does not equal " + FIRST_AMOUNT);

		equal = THIRD_AMOUNT.equals(FIRST_AMOUNT);
		if(equal)
			System.out.println(THIRD_AMOUNT + " equals " +
				FIRST_AMOUNT);
		else
			System.out.println(THIRD_AMOUNT + " does not equal "
				+ FIRST_AMOUNT);
	}
}