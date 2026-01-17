package ExcrptionHandling;
import java.util.*;
public class StudentMarksValidation {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		double Marks=0;
		
		try {
			System.out.println("Enter the Marks : ");
			Marks=sc.nextDouble();
			if(Marks<0 || Marks>100) {
				throw new IllegalArgumentException("Tuja Baba che school ahaya kai marks neat bhar!!!"); 
			}
			if(Marks >80 && Marks<100) {
				System.out.println("A");
			}
			else if(Marks>40 && Marks<60){
				System.out.println("Pass");
			}
			else if(Marks >60 && Marks<80) {
				System.out.println("B");
			}else if(Marks < 40) {
				System.out.println("Fail");
			}
		}catch(java.util.InputMismatchException e) {
			System.out.println("Excpetion : "+e);
		}
		catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Marks Filling process is completed run again to fill marks");
		}
	}
}
