package ExcrptionHandling;
import java.util.*;
public class Employee {

	private int empId;
	private String empName;
	private double basicSalary;
	private double bonus= 50;
	
	
	
	 public int getEmpId(int emp) {
		return empId;
	}




	 public void setEmpId(int[] empId,int length) {
		for(int i =0;i<length;i++ ) {
			this.empId = empId[i];
		}
	}




	public String getEmpName(String name) {
		return empName;
	}




	public void setEmpName(String[] empName,int length) {
		for(int i =0;i<length;i++) {
			this.empName = empName[i];	
		}
		
	}




	public double getBasicSalary() {
		return basicSalary;
	}




	public void setBasicSalary(double[] basicSalary,int lenght) {
		for(int i =0;i<lenght;i++) {
			this.basicSalary = basicSalary[i];	
		}
		
	}


	public double calculateSalary(double basicSalary) {
		return basicSalary+(basicSalary*bonus);
	}

	public static void main(String[] args) throws Exception{
		Scanner sc =new Scanner(System.in);
		Employee ep = new Employee();
		try {
			System.out.println("Enter the number of Employee's : ");
			int numberOfEmployee=sc.nextInt();
			int [] emp=new int[numberOfEmployee];
			for(int i=0;i<emp.length;i++) {
				System.out.println("Enter the ID of Emp["+i+"] id : ");
				emp[i]=sc.nextInt();
			}
			
			String []Name = new String[numberOfEmployee];
			for(int i =0;i<numberOfEmployee;i++) {
				System.out.println("Enter the Name of Emp["+emp[i]+"] id : ");
				Name[i]=sc.next();
			}
			
			int []salary = new int[numberOfEmployee]; 
			for(int i =0;i<numberOfEmployee;i++) {
				System.out.println("Enter the Salary of Emp["+emp[i]+"] id : ");
				salary[i]=sc.nextInt();
			}
			for(int i=0;i<numberOfEmployee;i++) {
				System.out.println("Emp ID : "+ep.getEmpId(emp[i])+" Name : "+ep.getEmpName(Name[i])+" Salary : "+ep.calculateSalary(salary[i]));
			}
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}

}
