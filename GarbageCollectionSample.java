


public class GarbageCollectionSample {

    public static void main(String [] args)
    {
    	String name1="Joseph";
    	String name2 = "Mulray";
    	System.out.println(name1);
    	System.out.println(name2);

    name1=null;
    System.out.println(name1.length());

    name1=name2;
    System.out.println(name1);
    System.out.println(name2);


    }


}
