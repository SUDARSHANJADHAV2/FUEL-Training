package Overloading;
import java.util.*;
public class Basic_Code {
	
	public double Area(double length,double breadth) {
		return length*breadth;
	}
	public int Area(int side) {
		return side*side;
	}
	public double Area(int base,int height) {
		return 0.5*base*height;
	}
	public double Area(double radius) {
		return 3.14*radius;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Length and Breadth : ");
		Basic_Code obj=new Basic_Code();
		double length = sc.nextDouble();
		double breadth =sc.nextDouble();
		System.out.println("Area of Rectangle : "+obj.Area(length,breadth));
		System.out.println("Enter the side  : ");
		int side =sc.nextInt();
		System.out.println("Area Square : "+obj.Area(side));
		System.out.print("Enter the length breadth and height : ");
		int base = sc.nextInt();
		int height=sc.nextInt();
		System.out.println("Area of Triangle : "+obj.Area(base,height));
		System.out.println("Enter the radius : ");
		double radius=sc.nextInt();
		System.out.println("Area of Circle"+obj.Area(radius));
	}

}
