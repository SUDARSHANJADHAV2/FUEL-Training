package ExcrptionHandling;
import java.util.*;
public class UseOfThrow {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			int age;
			System.out.println("Enter age : ");
			age = sc.nextInt();
			if(age<18) {
				throw new ArithmeticException ("Access Denied Underage");
				
			}
			System.out.println("New User");
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Process Completed");
		}
	}

}
