//Joseph Mulray Final Project Word Guessing Game May 1 2015

import javax.swing.JOptionPane;	//importing jOptionPane, util package, and throws IO Exception
import java.util.*;
import java.io.*;

public class Game{
	//Declaring feilds
	Procedure fp;
	char [] gameboard;
	char l;
	String s;
	String let;
	int count;
	boolean playAgain;
	String play;
	int numTries;
	int highscore;

    public Game()throws IOException
    {
    	fp = new Procedure();	//Procedure object
		gameboard = new char[fp.getLength()];	//creating an array gameboard of chars
    	count=0;
		playAgain=true;			//variable to test if user wants to play game again
		numTries=0;

    	  for(int x=0;x<fp.getLength();x++) 	//populatiing gameboard with _ characters of the length of the word.
    	 {
    	 	gameboard[x]='_';
    	 }

    }
    public void playGame()throws IOException		//game method
    {

    	while(playAgain==true)		//user will be prompted to if wants to playagain if user does not playAgain will = false
    	{


    	while(count<4 && gameWon()!=true ) //test variables to keep getting usres input until guesses wrong four times or completes word
    	{
    		getLetter();		//calls getLetter methods
    		testLetter();		//calls testLetter methods
    	}


    	if (gameWon()==true)	//determines if user wins
    	{
    		numTries++;		//keeps track of number of times user wins
    		JOptionPane.showMessageDialog(null,"Congradulations you guessed the word!\n So far you have won " + numTries + " time(s)!");
    	}


    	if(count>=4)		//test for number of tries
    	{
    		JOptionPane.showMessageDialog(null,"Sorry you ran out of guesses.\n The word was " + fp.getWord());
    	}


    	play= JOptionPane.showInputDialog("Type 'y' to play another game, anything else to quit");
    	if (play.compareToIgnoreCase("y")!=0) //testing users input whether wants to play again or not.
    	{
    		playAgain=false;		//stops game method from playing again


    		File file = new File("scores.txt");		//Extra credit highscore reading from scores file
			Scanner inputFile = new Scanner(file);		//creating scanner object to read from file
			highscore=Integer.parseInt(inputFile.nextLine());	//converting number from file into an integer



			if(numTries>highscore)	//comparing the number the user won and the previous highscore
				{
		 		JOptionPane.showMessageDialog(null,"Congradulations! You broke the highscore with " + numTries + " win(s)!\n The previous record was " + highscore + ". ");
		 		PrintWriter outputFile = new PrintWriter(file);	//PrintWriter object to replace number
				outputFile.println(numTries); //replaces number with new highscore
				outputFile.close(); //closes the file
				}
			JOptionPane.showMessageDialog(null, "You won " + numTries + " time(s)\nThanks for playing!\nCome again!");

    	}


		else	//if users input is is equal to y
			{
		count=0;		//resets counter
    	fp = new Procedure();			//calls Procedure object for another word
    	gameboard = new char[fp.getLength()];	//creates a new gameboard

    		for(int x=0;x<fp.getLength();x++)
    			{
    	 		gameboard[x]='_';
    	 		}

			}
    	}
    }



    public boolean gameWon() throws IOException //method to test if user guessed every letter returns a boolean
    {
    	boolean winner=true;
    	for(int x=0;x<fp.getLength();x++)
    	{
		if(gameboard[x]=='_') //for loop and if statement to read the gameboard array and returns false if an underscore is found.
		{
			winner=false;
		}
    	}
    	return winner;
    }




	public void getLetter() //method to get users input of a letter
	{

		 s= "Choose a letter to complete the word:\n";

		for(char str: gameboard)
		{
		s+=str + " ";											//PRINTING GAMEBOARD AND STORING STRING IN VARIALBE S
		}
		s+="\nThere are " +fp.getLength() + " letters in this word";

		let = JOptionPane.showInputDialog(s);

		if(let==null) //testing to see if user hit the cancel button
		{
		JOptionPane.showMessageDialog(null,"Cancel buttton clicked\n Program Terminated!\n Good-bye!");
		System.exit(0);	//ends the program
		}





	while(let.length()==0 || Character.isLetter(let.charAt(0))== false)		//tests conditions of input whether input was eventered
	{																		// or whether the input was a letter or not
		JOptionPane.showMessageDialog(null,"Invalid answer!");
		let = JOptionPane.showInputDialog(s);
		if(let==null)											//testing to see if user hit the cancel button
		{
		JOptionPane.showMessageDialog(null,"Cancel buttton clicked\n Program Terminated!\n Good-bye!");
		System.exit(0);
		}

	}
		l=let.charAt(0);
	}




	public void testLetter()		//tests the letter if it is found in the word and replaces that letter
	{								// to the corresponding area on the gameboard

		boolean letterword=false;			//boolean of whether word is in gameboard and replaces that letter on the gameboard
		for(int x=0;x<fp.getLength();x++)
		{
			if(l==(fp.getWord().charAt(x)))
			{
				gameboard[x]=l;
				letterword=true;
			}

		}
			if(letterword==false)	//tests if letter was not in the word
			{						//increments count if not
			count++;
			JOptionPane.showMessageDialog(null, l + " is not in the word\nYou have " + (4-count) + "  tries remaining" );
			}

		}
	}


