package Discount_Calculator;
import java.util.*;
public class Discount_Calculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the Amount : " );
		double input_amount = sc.nextInt();
		double discount = 0;
		if(input_amount>=10000) {
			discount=input_amount *0.30;
		}
		else if(input_amount>=5000) {
			discount=input_amount*0.2;
		}
		else {
			discount =0;
		}
		
		double final_amount = input_amount - discount;
		System.out.println("Discount : "+ discount);
		System.out.println("Final Amount : " + final_amount);
	}

}
