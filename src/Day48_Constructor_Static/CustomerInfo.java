package Day48_Constructor_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomerInfo {

    public static void main(String[] args) {

        Customer customer = new Customer();

        System.out.println(customer);

        customer.setName("Trump");
        customer.setId(2021);
        System.out.println(customer);

        Customer newCustomer1 = new Customer("Mike", 2);
        System.out.println(newCustomer1);
        Customer newCustomer2 = new Customer("Nijat", 2886);
        System.out.println(newCustomer2);

        // We changing the data
        Customer newCar = new Customer("Mazda", 2018);
        newCar = new Customer("Kia", 2019);
        newCar.setName("Toyota");
        newCar.setId(2020);
        System.out.println(newCar);

        // We can create Array And list with custom class
        // Array of customer
        Customer[] customers = {customer, newCustomer1, newCustomer2, new  Customer("Bashir", 200)};
        System.out.println("customers = " + Arrays.toString(customers));
        System.out.println();

        System.out.println("--->All abjects from customers array<---");
        for (int i = 0; i < customers.length; i++) {
            System.out.println(customers[i]);
        }

        // ArrayList of Customer object
        ArrayList<Customer> customerList = new ArrayList<>();
        customerList.add(customer);
        customerList.add(newCustomer1);
        customerList.add(newCustomer2);
        customerList.add(new Customer("Ali", 23));
        customerList.add(new Customer("John", 234));
        System.out.println("customerList = " + customerList);
        System.out.println();

        // if we want to print out the first customer
        System.out.println("The first customer: " + customerList.get(0));
        System.out.println("The first customer: " + customers[0]);
        System.out.println();

        //
        for ( Customer each: customerList ) {
            System.out.println(each);
        }

        System.out.println();

        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(customerList.get(i));
        }

        customerList.forEach(each -> System.out.print(each.getName() + ", "));
        System.out.println();
        customerList.forEach(each -> System.out.println(each.getId()));
    }
}
