package Constructor;
import java.util.*;
public class Example_Of_Constructor {
	String name;
	int age;
	Example_Of_Constructor(String n,int a){
		name=n;
		age=a;
	}
	void display() {
		System.out.println(name +" is "+age);
	}

	public static void main(String[] args) {
		String name;
		int age;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Name : ");
		name=sc.nextLine();
		System.out.println("Enter the Age : ");
		age =sc.nextInt();
		Example_Of_Constructor Person1 =new Example_Of_Constructor(name,age);
		Person1.display();
		
	}

}
