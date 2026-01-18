package Overriding;

public class Developer extends Employee{
	double overTimePay=5000;
	@Override
	double CalculateSalary() {
		return overTimePay+ BaseSalary;
	}
	

}
