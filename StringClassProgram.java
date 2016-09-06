//Joseph Mulray Final Exam May 5 2015.
public class StringClassProgram {

    public static void main(String [] args)
  {
    	String department= new String("Computer Science and Information Technology");

    	if(department.startsWith("Computer"))
    	{
    		System.out.println("String starts with Computer");
    	}
    	else
    		System.out.println("String does not start with Computer");



		System.out.println();



		int index=department.indexOf("Science");

		String myString=department.substring(index);
		System.out.println(myString);



		System.out.println();



		String [] departmentWords = department.split(" ");

		for(String str: departmentWords)
			System.out.println(str);


  }


}