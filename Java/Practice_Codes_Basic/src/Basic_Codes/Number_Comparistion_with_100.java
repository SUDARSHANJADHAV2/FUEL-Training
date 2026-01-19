package Basic_Codes;
import java.util.Scanner;

public class Number_Comparistion_with_100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int input_number = sc.nextInt();
		if(input_number>100) {
			System.out.println("Greater then 100");
		}
		else {
			if(input_number<100) {
				System.out.println("Less then 100");
			}
			else {
				if(input_number==100){
					System.out.println("Number Equal to 100");
				}
			}
		}
	}
}
