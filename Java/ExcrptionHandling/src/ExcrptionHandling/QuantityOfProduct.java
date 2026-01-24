package ExcrptionHandling;
import java.util.*;
public class QuantityOfProduct {
	
	static void palceOrder(int quantity) throws Exception{
		if(quantity<=0 || quantity>20) {
			throw new Exception("Enter Quantity Between 1 to 20 only.");
		}
		else {
			System.out.println("Order Placed Sucessfully of Quantity : "+quantity);
		}
}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			int quantity;
			System.out.println("Enter the quantity : ");
			quantity=sc.nextInt();
			if(quantity<=0 || quantity>20) {
				throw new Exception("Enter Quantity Between 1 to 20 only.");
			}
			palceOrder(quantity);
		}catch(Exception e) {
			System.out.println(e.getMessage());;
		}
	}

}
