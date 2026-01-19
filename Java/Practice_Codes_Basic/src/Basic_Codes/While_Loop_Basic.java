package Basic_Codes;
import java.util.*;
public class While_Loop_Basic {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int number=0;
		while(true) {
			System.out.println("Enter the customer number : ");
			number =sc.nextInt();

			if(number <100) {
				System.out.println("Offer is available you can Proceed!!! hurrraayyyyy");
			}
			else {
				System.out.println("Offer smaple ja ghari nigggg, chal!!!!");
				break;
			}
		}
	}

}
