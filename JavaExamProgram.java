//DIRECTIONS: Replace the ??????????? with the correct missing code.
/**
 * Programmer:
 * Date: 02/17/15
 * Description: This program ????????????????????????
 **/

 // ENTER CODE TO IMPORT REQUIRED JAVA PACKAGE
import java.util.Scanner;
 public class JavaExamProgram
 {
 	public static void main(String [] args)
 	{
 		String word;
 		String word2;
 		Scanner keyboard = new Scanner(System.in);

 		System.out.print("Enter a word: ");
 		word = keyboard.nextLine();

 		//Complete the following code to print the first character in the word
 		System.out.println("The first letter in the word is: " + word.charAt(0));

 		//Complete the following code to print the word in upper case.
 		System.out.println("The word in all CAPS: " + word.toUpperCase());

 		//Complete the following line of code to print the length of the word.
 		System.out.println("The length of the word is:  " + word.length());

 		System.out.print("Enter another word: ");
 		word2 = keyboard.nextLine();

 		//Commplete the code to test if the String objects: word and word2 contain the same word.
 		if(word == word2)
 			System.out.println("The two words are the same.");
 		else
 			System.out.println("The two words are different.");

 		//BONUS: Complete the following line of code to print the last letter in the word
 		//You may add extra lines of code if you wish.
 		int	wordlength=(word.length()-1);
 		System.out.println("The last letter in the word is:  " + word.charAt(wordlength));
 	}
 }