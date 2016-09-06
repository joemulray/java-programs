//Joseph Mulray Final Exam May 5 2015.
import java.util.ArrayList;

public class ArrayListProgram {

    public static void main(String [] args)
    {
    	ArrayList<Integer> myNumbers = new ArrayList <Integer>();
    	myNumbers.add(1);
    	myNumbers.add(3);
    	myNumbers.add(5);
    	myNumbers.add(7);
    	myNumbers.add(9);

    	myNumbers.remove(0);

    	for(int x: myNumbers)
    		System.out.println(x);

		myNumbers.add(1,4);

		System.out.println();
    	System.out.println(myNumbers.toString());


    	myNumbers.set((myNumbers.size()-1), 0);

		System.out.println();
    	for(int x: myNumbers)
    		System.out.println(x);


    }


}