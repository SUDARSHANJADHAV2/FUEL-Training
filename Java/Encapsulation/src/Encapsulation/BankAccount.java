package Encapsulation;
import java.util.*;
public class BankAccount {

	public static void main(String[] args) {
		String name;
		double amount;
		long account_no;
		String email;
		Basic_Code user = new Basic_Code();
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your name :");
		name=sc.nextLine();
		System.out.println("Enter your account number : ");
		account_no=sc.nextInt();
		System.out.println("Enter the amount : ");
		amount=sc.nextInt();
		System.out.println("Enter your email : ");
		email=sc.nextLine();
		user.set_account_no(account_no);
		user.set_amount(amount);
		user.set_email(email);
		user.set_name(name);
		sc.next();
		System.out.println("Account no.: "+user.get_account_no()+" belongs to "+user.get_name()+ " with emailID : "+user.get_email()+" has Rs."+user.get_amount() + " in his account.");
		}

}
