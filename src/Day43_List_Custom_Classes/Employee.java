package Day43_List_Custom_Classes;

import java.util.Random;

public class Employee {

    // instance/ object variables
    String name;
    String jobTitle;
    long salary;

    // instance/object method
    public void work(){

        Random rn = new Random(2);
        salary = rn.nextLong();
        System.out.println(name + " works as " + jobTitle + "\nSalary: $" + salary);


    }

}
