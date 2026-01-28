package CollectionFrameWork;
import java.util.LinkedList;

public class LinkedListTask {
    public static void main(String[] args) {

        // Create LinkedList of Employee objects
        LinkedList<Employee> empList = new LinkedList<>();

        // Add employees
        empList.add(new Employee(101, "Rahul", 35000));
        empList.add(new Employee(102, "Anita", 42000));
        empList.add(new Employee(103, "Suresh", 50000));

        // Calculate sum of salaries
        double totalSalary = 0;

        for (Employee e : empList) {
            totalSalary += e.salary;
        }

        // Display result
        System.out.println("Total Salary of all employees: " + totalSalary);
    }
}