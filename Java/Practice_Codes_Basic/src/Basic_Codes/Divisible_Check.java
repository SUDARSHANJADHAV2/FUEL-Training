package Basic_Codes;
import java.util.*;
public class Divisible_Check {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter the Number : ");
		int number = sc.nextInt();
		if(number%5==0 && number%11==0) {
			System.out.println("Number is Divisible by 5 and 11");
		}
		else if(number%5==0){
			System.out.println("Number is Divisible by 5 but not by 11");

		}
		else{
			System.out.println("Number is Divisible by 11 but not by 5");

		}
	}

}
