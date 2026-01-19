package Basic_Codes;
import java.util.*;
public class Loops_Basics {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int input_number = sc.nextInt();
		System.out.println(input_number + "'s Table");
		for(int i=1;i<=10;i++) {
			System.out.println(input_number + " x " + i + " = " + i*input_number);
		}
	}

}
