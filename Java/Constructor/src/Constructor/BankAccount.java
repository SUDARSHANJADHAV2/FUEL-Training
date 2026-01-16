package Constructor;
import java.util.*;
public class BankAccount {
	long customerID = 976391113 ;
	int pin = 2171 ;
	double balance=5000;
	BankAccount(long customerID,int pin){
		if(customerID == this.customerID && pin==this.pin) {
			int choice;
			Scanner sc =new Scanner(System.in);
			do{
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit");
				System.out.println("3. Withdraw");
				System.out.println("4. Exit");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("Balance : "+balance);
					break;
				case 2:
					System.out.println("Desposit : ");
					double deposit=sc.nextInt();
					balance=deposit+balance;
					System.out.println("Balance : "+balance);
					break;
				case 3:
					System.out.println("Withdraw : ");
					double withdraw = sc.nextInt();
					balance=balance-withdraw;
					System.out.println("Balance : "+balance);
					break;
				case 4:
					System.out.println("####Exit####");
					System.exit(0);
					}
				
			}while(choice<=4&& choice>=0);
		}else {
			System.out.println("CustomID Or Password is wrong try again.");
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long customerID=0;
		int pin=0;
		
		System.out.println("Enter the CustomerID : ");
		customerID=sc.nextLong();
		System.out.println("Enter the Pin : ");
		pin=sc.nextInt();
		BankAccount Person1 = new BankAccount(customerID,pin);
	}

}
