package ExcrptionHandling;
import java.util.*;
public class UseOfThrows {

	static int operation(int num1, int num2) throws ArithmeticException,IllegalArgumentException,InputMismatchException {
		return num1/num2;
	}
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try {
			System.out.println("Enter the num1");
			int num1=sc.nextInt();
			System.out.println("Enter the num2");
			int num2=sc.nextInt();
			int result = operation(num1,num2);
			System.out.println("Result : "+result);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
	}

}
