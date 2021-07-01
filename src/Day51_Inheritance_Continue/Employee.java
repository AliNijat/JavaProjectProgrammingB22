package Day51_Inheritance_Continue;

public class Employee {

    String jobTitle;

    public double CalculateSalary(double hourlyRate){
        double annualSalary = hourlyRate * 1.0 * 2080;
        return annualSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
