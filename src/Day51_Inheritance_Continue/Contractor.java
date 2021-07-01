package Day51_Inheritance_Continue;

public class Contractor extends Employee {

    @Override
    public double CalculateSalary(double hourlyRate){
        double annualSalary = hourlyRate * 2080;
        return annualSalary;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
