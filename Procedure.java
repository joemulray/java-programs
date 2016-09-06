//Joseph Mulray Final Project Word Guessing Game May 1 2015
import javax.swing.JOptionPane;		//importing jOptionPane, util package, and throws IO Exception
import java.util.*;
import java.io.*;

public class Procedure
{
	//Declaring feilds
	String [] array;
	String word;


    public Procedure() throws IOException	//CONSTRUCTOR
    {
    	array = new String[10];		//creating a new string array
    	getFile();					//calling the getFile and random methods
    	random();

	}


	public static void message()	//WELCOME MESSAGE
	{
		JOptionPane.showMessageDialog(null, "Welcome to the Word Guessing Game!\nYou will choose a category of words and try to\n guess the letters in the word. Good Luck!");
	}


	public void getFile() throws IOException	//GETS USER INPUT ON WHICH FILE HE/SHE WANTS TO PLAY
	{
		String txtfile;			//declaring feilds
		String category;

	category = JOptionPane.showInputDialog("Please Enter a number of the category you wish to guess \n 1.Fruits\n 2.Animals\n 3.Flowers ");

		if(category==null)		//testing to see if user hit cancel button
		{
		JOptionPane.showMessageDialog(null,"Cancel buttton clicked\n Program Terminated!\n Good-bye!");
		System.exit(0);
		}

		while((category.equals("1")==false) && (category.equals("2")==false) && (category.equals("3")==false)) //testing whether the user entered in a
		{																										//valid number of not has to be between
			JOptionPane.showMessageDialog(null,"Invalid Answer");												// 1, 2, and 3.
			category = JOptionPane.showInputDialog("Please Enter a number of the category you wish to guess \n 1.Fruits\n 2.Animals\n 3.Flowers ");


			if(category==null)			//testing to see if user hit cancel button
			{
			JOptionPane.showMessageDialog(null,"Cancel buttton clicked\n Program Terminated!\n Good-bye!");
			System.exit(0);
			}

		}


					//taking users input and testing which file to be used
	switch(category)
		{

		case "1": txtfile="Fruits.txt";
			break;
		case "2":txtfile = "Animals.txt";
			break;
		default:txtfile = "Flowers.txt";
			break;
		}

		File file = new File(txtfile);				//file object
		Scanner inputFile = new Scanner(file);		//Scanner object to read from file

		for(int x=0;x<array.length;x++)
		{
			array[x]=inputFile.nextLine();	//populating array with random words from file.
		}



	}


	public void random()
	{
		Random random = new Random();		//creating random word object
		int randomNum =random.nextInt(array.length); //getting a random number based on length of array

		word = array[randomNum]; //getting a random word from array and storing in varaible word

	}


	public int getLength()			//gets length of word and returns and integer
	{
		return word.length();
	}


	public String getWord()			//get the word and returns a string
	{
		return word;
	}
}