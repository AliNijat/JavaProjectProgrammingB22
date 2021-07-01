package Day51_Inheritance_Continue;

public class EmployeeObject {

    public static void main(String[] args) {


        Employee employee = new Employee();
        employee.jobTitle = "Tester";
        System.out.println("Job Title: " + employee);

        // Math.round -> method works with a variable not with a functions.
        double annual = employee.CalculateSalary(59.99);
        System.out.println( Math.round(annual));

        System.out.println();

        Contractor contractor = new Contractor();
        contractor.jobTitle = "Tester";
        System.out.println("Job title: " + contractor);
        double annualS = contractor.CalculateSalary(90);
        System.out.println(Math.round(annualS));
    }
}
