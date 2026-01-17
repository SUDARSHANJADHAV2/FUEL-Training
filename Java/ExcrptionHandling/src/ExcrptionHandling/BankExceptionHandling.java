package ExcrptionHandling;
import java.util.*;
public class BankExceptionHandling {
	
	static double withdraw(double amount,double balance){
		return balance-amount;
	}
	
	public static void main(String[] args) throws Exception{
		Scanner sc =new Scanner(System.in);
		try {
			double balance = 10000;
			System.out.println("Enter amount you want to with draw : ");
			double amount=sc.nextInt();
			if(amount>balance) {
				throw new Exception("Amount greater then balance");
			}
			System.out.println("Final Balance : "+withdraw(amount,balance));
			
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
