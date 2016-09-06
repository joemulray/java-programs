import java.util.Scanner;

public class StudentInfoArray
{

    public static void main(String [] args)
  	{
  		Scanner keyboard = new Scanner(System.in);
  		StudentInfo [] info = new StudentInfo[5];
  		String ID;
  		double GPA;

  		for (int x=0; x<info.length;x++)
  		{
  			System.out.print("Enter ID for person " + (x+1)+ ": ");
  			ID = keyboard.nextLine();

  			System.out.print("Enter GPA for person " + (x+1)+ ": ");
  			GPA = keyboard.nextDouble();

  			keyboard.nextLine();

  			info [x] = new StudentInfo(ID, GPA);
  		}

		for (int x=0; x<info.length;x++)
		{
			System.out.println(info[x]);
		}
    }


}