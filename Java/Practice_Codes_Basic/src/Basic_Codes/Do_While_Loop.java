package Basic_Codes;
import java.util.*;
public class Do_While_Loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pin=2171;
		System.out.println("Enter the pin to access account : ");
		int enter_pin =sc.nextInt();
		int balance=5000;
		int choice;
		if(enter_pin == pin) {
			do {
				System.out.println("###### Dhinchak ATM Service ######");
				System.out.println("1. Check Balance");
				System.out.println("2. Deposit Money");
				System.out.println("3. Withdraw Money");
				System.out.println("4. Exit");
				System.out.println("Enter your Choice Task: ");
				choice = sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("### Check Balance ###");
					System.out.println("Account Current Balance Ammount : " + balance);
					break;
				case 2:
					System.out.println("### Deposit Money ###");
					System.out.println("Enter the Ammount : ");
					int add_Amount =sc.nextInt();
					balance += add_Amount;
					System.out.println("Account Current Balance Ammount : " + balance);
					break;
				case 3:
					System.out.println("### Withdraw Money ###");
					System.out.println("Enter the Amount to withdraw : ");
					int sub_Amount = sc.nextInt();
					balance -= sub_Amount;
					System.out.println("Account Current Balance Ammount : " + balance);
					break;
				case 4:
					System.out.println("### Exit ###");
					System.exit(0);
				}
			}
			while(choice <=4 &&choice >0 ) ;
		}else {
			System.out.println("Arrraayyy kai yada ahaayas kai pin mahit nhi chal niggg!!!!");
		}
		
	}

}
