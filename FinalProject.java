//Joseph Mulray Final Project Word Guessing Game May 1 2015
//I did not receive help from anyone on this project

import javax.swing.JOptionPane;
import java.util.*;				//import declarations
import java.io.*;
public class FinalProject {



    public static void main(String [] args) throws IOException
    {
    //Calling welcome Screen
 	Procedure.message();
 	//Game object
    Game g = new Game();
    //Play game method
    g.playGame();

    }


}