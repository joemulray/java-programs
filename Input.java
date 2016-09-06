/**
 * @(#)Input.java
 *
 * Input application
 *
 * @author
 * @version 1.00 2015/1/22
 */
import javax.swing.JOptionPane;

public class Input {

    public static void main(String[] args) {
		String age,name;

    	age = JOptionPane.showInputDialog("Enter your age:  ");
		Integer.parseInt(age);



    	name = JOptionPane.showInputDialog("Enter your name:  ");


    	System.out.println("Name: " + name);
    	System.out.println("Age: " + age);
    	System.exit(0);
    }
}
