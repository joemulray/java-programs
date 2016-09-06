

public class ArraySample {

    public static void main(String [] args)
    	 {
    	int [] numbers1 = {3,6,9,12,15,18,21,24,27,30};

    	System.out.println("Printing out values in numbers1: ");
    		for(int x: numbers1)
    			System.out.println(x);
    	int [] numbers2 = numbers1;
    	System.out.println("Printing out values in numbers2: ");
    		for(int x: numbers2)
    			System.out.println(x);

    	numbers1[5] = -999;

    	System.out.println("Printing out values in numbers1: ");
    	    		for(int x: numbers1)
    			System.out.print(x + " ");

System.out.println("");

    	System.out.println("Printing out values in numbers2: ");
    		for(int x: numbers2)
    			System.out.print(x + " ");

    	numbers2 = new int[10];
    	for(int x=0; x<numbers1.length;x++)
    		numbers2[x] = numbers1[x];

   		numbers1[0]=1000;

   		    	System.out.println("Printing out values in numbers1: ");
    		for(int x: numbers1)
    			System.out.print(x + " ");

System.out.println("");

    	System.out.println("Printing out values in numbers2: ");
    		for(int x: numbers2)
    			System.out.print(x + " ");

    }


}