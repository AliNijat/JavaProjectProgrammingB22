package Day43_List_Custom_Classes;

public class Company {
    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ali";
        employee1.jobTitle = "SDET";
        employee1.work();
        System.out.println("employee1 name = " + employee1.name);
        System.out.println("employee1 jobTitle = " + employee1.jobTitle);

        System.out.println();

        Employee employee2 = new Employee();
        employee2.name = "Mohammad";
        employee2.jobTitle = "Engineer";
        employee2.work();
        System.out.println("employee2 name = " + employee2.name);
        System.out.println("employee2 jobTitle = " + employee2.jobTitle);

    }
}
