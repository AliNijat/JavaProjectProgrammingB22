package Day47_constructors;

public class Student {

    public Student(){

        System.out.println("No-Args constructor");

    }

    public Student(String name){
       // name = "Papa John";
        System.out.println("name = " + name);
        System.out.println("constructor method with parameter, " + name);
    }

    public Student(int age ){
        System.out.println("age param constructor | age = " + age);
    }

    public Student(String name, int age){
        System.out.println("2 param constructors \n| age and name = " + name + ", " + age);
    }
}
