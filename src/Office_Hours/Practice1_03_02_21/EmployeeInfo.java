package Office_Hours.Practice1_03_02_21;

public class EmployeeInfo {
    public static void main(String[] args) {

        String firstName = "Mohammad Ali, ";
        String lastName = "Nijat";
        String fullName = firstName + lastName;

        String companyName = "google";
        double salary = 150000;
        int startDay = 1, startMonth = 1, startYear = 2022;

        boolean isFullTime = true;
        String jobTitle = "Assurance Engineer";

        String officeAddress = "12340 capital hill blv, whasington DC 10001 USA.";
        System.out.println();

        System.out.println("Employee full name: " + fullName);
        System.out.println("Job title: " + jobTitle);
        System.out.println("Company name: " + companyName +"\nOffice located at: " + officeAddress );
        System.out.println("Employee contacts: " + lastName+"22@" +companyName+".com" );
        System.out.println();
        System.out.println("Full time? " + isFullTime);
        System.out.println("Annually Salary: $" + salary);
        System.out.println("Start date: " +startDay + "/"+ startMonth + "/" + startYear);
        System.out.println("Salary after 3 years: " + salary +(( startYear + 2 ) * 1000) );




    }
}
