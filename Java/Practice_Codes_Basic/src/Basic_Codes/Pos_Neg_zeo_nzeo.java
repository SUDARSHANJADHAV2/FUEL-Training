package Basic_Codes;
import java.util.*;

public class Pos_Neg_zeo_nzeo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int input_number = sc.nextInt();
		if(input_number>0) {
			System.out.println("Postive");
		}
		else {
			if(input_number<0) {
				System.out.println("Negative");
			}
			else {
				if(input_number==0){
					System.out.println("Zero");
				}
				
			}
		}
	}
}
