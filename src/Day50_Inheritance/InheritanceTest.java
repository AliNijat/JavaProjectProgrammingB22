package Day50_Inheritance;

public class InheritanceTest {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Ali"; person1.age = 32;
        System.out.println("Name: " + person1.name + ", Age: " + person1.age);
        person1.talk(); person1.walk(); person1.work("as a Tester");

        System.out.println();

        Teacher teacher1 = new Teacher();
        teacher1.name = "Nijat"; teacher1.age = 31; teacher1.teacherId= 1234;
        System.out.println("ID: " + teacher1.teacherId + ", Name: " + teacher1.name + ", Age: " + teacher1.age);
        teacher1.walk(); teacher1.talk(); teacher1.work("as a Developer");

        System.out.println();

        Student student = new Student();
        student.name = "Mohammad"; student.age = 30;
        System.out.println("Name: " + student.name +", Age: " + student.age);
        student.talk(); student.walk(); student.work("as a Student");
        student.school = "Cybertek";
        student.study("Java");

    }
}
