package Basic_Codes;
import java.util.*;
public class Print_Even_Numbers {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the number : ");
		int input_number = sc.nextInt();
		for(int i =0;i<=input_number;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
	}

}
