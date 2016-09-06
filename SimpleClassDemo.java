public class SimpleClassDemo
{
   public static void main(String [] args)
   	{
		SimpleSubClass sample = new SimpleSubClass("Programming is fun!");
		System.out.println("Printing the SimpleSubClass object.");
		System.out.println(sample);
		System.out.println();
		System.out.println("Printing the SimpleClass object.");
		SimpleClass sample2 = new SimpleClass();
		System.out.println(sample2);
   }
}
