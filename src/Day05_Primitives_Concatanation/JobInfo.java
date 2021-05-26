package Day05_Primitives_Concatanation;

public class JobInfo {
    public static void main(String[] args) {

        String jobTitle = "Java SDET";
        String company = "AZ IT";
        String JobDesc = "Fimiler with Java, Selenium, Cucumber, Tomato, JUnit";
        double salary = 180000;
        byte yearsOfExp = 3;
        boolean hasBenefits = true;

        System.out.println("Job title is: " + jobTitle);
        System.out.println("Company name is: " + company);
        System.out.println(JobDesc);
        System.out.println("Salary is: $" + salary);
        System.out.println("have to have "+ yearsOfExp + " years experience");
        System.out.println("Has benefits? - " + hasBenefits);



    }
}
