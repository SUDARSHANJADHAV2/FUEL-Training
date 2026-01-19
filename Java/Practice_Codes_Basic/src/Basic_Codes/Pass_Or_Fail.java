package Basic_Codes;

import java.util.Scanner;

public class Pass_Or_Fail {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.print("Enter marks of Student : ");
		int input_marks = sc.nextInt();
		if(input_marks>=40) {
			System.out.print("Result : Pass");
		}
		else {
			System.out.print("Result : Fail");
		}
	}

}
