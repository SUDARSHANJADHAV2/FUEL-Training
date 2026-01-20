package Overriding;
import java.util.*;
public class Fuel_Cha_Employee {
	public static void main(String[] args) {
		Employee Emp = new Employee();
		Employee Dev = new Developer();
		Employee Mang = new Manager();
		System.out.println("Employee Salary : "+Emp.CalculateSalary());
		System.out.println("Developer Salary : "+Dev.CalculateSalary());
		System.out.println("Manager Salaray : "+Mang.CalculateSalary());		
	}
}
