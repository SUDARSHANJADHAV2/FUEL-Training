package Basic_Codes;
import java.util.*;
public class Greater_Of_Two {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the first Number : ");
		int first_input_number = sc.nextInt();
		System.out.print("Enter the second Number : ");
		int  second_input_number =sc.nextInt();
		if(first_input_number > second_input_number) {
			System.out.println("The greater number is " + first_input_number );
		}
		else {
			System.out.println("The greater number is " + second_input_number );
		}
	}

}
