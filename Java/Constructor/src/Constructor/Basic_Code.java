package Constructor;
import java.util.*;
public class Basic_Code {
	String name;
	int rollno;
	static String DIV;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Basic_Code A =new Basic_Code();
		System.out.println("Enter the name : ");
		A.name=sc.nextLine();
		System.out.println("Enter the roll no.: ");
		A.rollno=sc.nextInt();
		System.out.print("Div : ");
		A.DIV=sc.next();
		System.out.println("Roll no.: "+A.rollno+" is of "+A.name + " from Div : "+A.DIV);
	}

}
