package Basic_Codes;
import java.util.*;
public class Match_the_password {

	public static void main(String[] args) {
		int password =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Password : ");
		password =sc.nextInt();
		System.out.println("Passwords is now set!!! Hope you remember it hmmm....");
		while(true) {
		System.out.print("Try typing the password again lets see if you can remember it : ");
		int match_password=sc.nextInt();
		if (match_password==password) {
			System.out.println("Tu tar lai hushar ahayas ray chan chan ja aata");
			break;
		}
		else {
		System.out.println("Array murkha aata 2 min pan nhi zala password set karun yadaya");	
		}
		}
	}

}
