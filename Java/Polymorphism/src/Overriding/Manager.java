package Overriding;

public class Manager extends Employee{
	double bonus=10000;
	@Override
	double CalculateSalary(){
		return BaseSalary+bonus;
	}

	
}
