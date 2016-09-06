//Joseph Mulray Lab 5 March 10 2015
public class DiceSimulation
{
	public static void main(String[] args)
	{
		final int NUMBER = 10000;	//the number of times to
									//roll the dice

		Dice die1 = new Dice(); 	// the first die
		Dice die2 = new Dice(); 	// the second die
		int die1Value;				// number of spots on the first die
		int die2Value;				// number of spots on the second die

		int count = 0;				// number of times the dice were rolled
		int snakeEyes = 0;			// number of times snake eyes rolled
		int twos = 0;				// number of times double two is rolled
		int threes = 0;				// number of times double three is rolled
		int fours = 0;				// number of times double four is rolled
		int fives = 0;				// number of times double five is rolled
		int sixes = 0;				// number of times double six is rolled


		//ENTER YOUR CODE FOR THE ALGORITHM HERE
		//repeat while number of dice rolls are less than the number of times the dice should be rolled.
		while(count<NUMBER)
		{
			//increment the number of times the dice were rolled
			count++;
			//roll the first die
			die1.roll();
			//Get the value of the first die
			die1Value = die1.getSpots();
			//roll the second die
			die2.roll();
			//Get the value of the second die
			die2Value= die2.getSpots();

			//If the value of the first die is the same as the value of the second die
			if (die1Value == die2Value)
			{
				//if the value of the first die is 1 increment snakeEyes
				if (die1Value==1)
					snakeEyes++;
				////if the value of the firsr die is 2 increment twos
				else if (die1Value==2)
					twos++;
				//if the value of the first die is 3 increment threes
				else if (die1Value==3)
					threes++;
				//if the value of the first die is 4 increment fours
				else if (die1Value==4)
					fours++;
				//if the value of the first die is 5 increment fives
				else if (die1Value==5)
					fives++;
				//if the value of the first die is 6 increment sixes
				else if (die1Value==6)
					sixes++;

			}

		}
		System.out.println ("You rolled snake eyes " + snakeEyes + " out of " + count + " rolls.");
		System.out.println ("You rolled double twos " + twos + " out of " + count + " rolls.");
		System.out.println ("You rolled double threes " + threes + " out of " + count + " rolls.");
		System.out.println ("You rolled double fours " + fours + " out of " + count + " rolls.");
		System.out.println ("You rolled double fives " + fives + " out of " + count + " rolls.");
		System.out.println ("You rolled double sixes " + sixes + " out of " + count + " rolls.");
	}
}

