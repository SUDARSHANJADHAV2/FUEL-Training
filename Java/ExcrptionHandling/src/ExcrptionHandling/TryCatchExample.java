package ExcrptionHandling;

public class TryCatchExample {

	public static void main(String[] args) {
		int a=10,b=5,c=0;
		System.out.println(a+b);
		System.out.println(a*b);
		try {
			System.out.println(a/c);
		}
		catch(Exception e) {
			System.out.println("The Exception was handled Successfully it was : "+e);
		}
		System.out.println(a+b+c);
		System.out.println(a+c);
		
	}

}
