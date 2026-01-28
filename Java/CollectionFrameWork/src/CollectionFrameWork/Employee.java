package CollectionFrameWork;
import java.util.Objects;

public class Employee {

    private long adharNo;
    private String name;
    double salary;

    public Employee(long adharNo, String name, double salary) {
        this.adharNo = adharNo;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Employee employee = (Employee) o;
        return adharNo == employee.adharNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(adharNo);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Aadhaar: " + adharNo + ", Salary: " + salary;
    }
}
