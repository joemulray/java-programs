import java.util.Scanner;
public class SoftwareDemo {



    public static void main(String[] args)
    {

			Software s = new Software();

			System.out.println("Quantity: " + s.getQuantity());
			System.out.println("Price: " + s.getPrice());
			System.out.println("Discount: " + s.getDiscount());
			System.out.print("Total: " + s.total());

    }
}
