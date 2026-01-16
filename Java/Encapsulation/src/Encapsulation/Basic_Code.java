package Encapsulation;
import java.util.*;
public class Basic_Code {
	private int age;
	private long account_no;
	private double amount ;
	private String email;
	private String name;
	
	public void set_age(int age) {
		this.age=age;
		if(age>=1) {
			System.out.println("My age is "+age);
		}
		else {
			System.out.println("Tuja baba cha aashe hote kai rayyy");
		}
	}
	
	
	public void set_account_no(long account_no){
		this.account_no=account_no;
	}
	public long get_account_no() {
		return account_no;
	}
	
	public void set_email(String email){
		this.email=email;
	}
	public String get_email() {
		return email;
	}
	
	public void set_name(String name) {
		this.name=name;
	}
	public String get_name() {
		return name;
	}
	
	public void set_amount(double amount) {
		this.amount=amount;
	}
	public double get_amount() {
		return amount;
	}
	
}
