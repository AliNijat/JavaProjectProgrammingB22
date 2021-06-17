package Day43_List_Custom_Classes;

public class Person {

    // Data -> Variable
    String firstName;
    int age;
    char gender;

    // Behavior -> Method
    public void speak() {
        System.out.println("Person is speaking!");
    }
}

class People { // for running the codes
    public static void main(String[] args) {

        // crate object of Person class -  Instantiate class
        Person person1 = new Person();
        person1.firstName = "Ali";
        person1.age = 31;
        person1.gender = 'M';
        person1.speak();

        System.out.println("person1 firstName = " + person1.firstName);
        System.out.println("person1 age = " + person1.age);
        System.out.println("person1 gender = " + person1.gender);

        System.out.println();

        Person person2 = new Person();
        person2.firstName = "Nijat";
        person2.age = 32;
        person2.gender = 'M';
        person2.speak();

        System.out.println("person2 firstName = " + person2.firstName);
        System.out.println("person2 age = " + person2.age);
        System.out.println("person2 gender = " + person2.gender);


    }
}



