package Basic_Codes;
import java.util.*;
public class Even_Odd {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter number : ");
		int input_number = sc.nextInt();
		if(input_number%2==0) {
			System.out.println("Even");
		}
		else {
			System.out.println("Negative");
		}
	}

}
