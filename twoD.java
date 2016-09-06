


public class twoD
{

    public static void main(String [] args)
    {
    	int [][] array = {{2,4,6,8}, {3,6,9,12}};
		int total=0;

		for(int row=0; row<2;row++)
		{
			for(int col=0; col<4;col++)
			 total+=array[row][col];
		}
		System.out.print("Total: " + total);
		System.out.println();

		for(int row=0; row<array.length;row++)
		{

			for(int col=0; col<array[row].length;col++)
			{
			System.out.print(array[row][col] + " " );
			}
			System.out.println();
		}
		int amount =0;
		for(int col=0;col<4; col++)
		{
			amount+= array[0][col];
		}
		System.out.print("Total in row 1: " + amount);

    }



}