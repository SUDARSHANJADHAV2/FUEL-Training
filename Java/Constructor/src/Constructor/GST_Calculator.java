package Constructor;
import java.util.*;
public class GST_Calculator {
	static double GST=0.18;
	int amount=0;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		GST_Calculator A =new GST_Calculator();
		System.out.println("Enter the amount : ");
		A.amount=sc.nextInt();
		double final_amount=A.amount+A.amount*GST;
		System.out.println("Amount + GST = "+final_amount );
	}

}
