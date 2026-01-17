package Encapsulation;
import java.util.*;
public class Age_Access {

	public static void main(String[] args) {
		int age;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your age : ");
		Basic_Code Person =new Basic_Code();
		age=sc.nextInt();
		Person.set_age(age);
	}

}
