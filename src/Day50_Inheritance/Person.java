package Day50_Inheritance;

public class Person {   // this is our super/parent class/base class
    String name;
    int age;

    public void walk (){
        System.out.println( name + " is waling");
    }

    public void talk (){
        System.out.println( name + " is talking");
    }

    public void work (String job){
        System.out.println(name+ " is working " + job);
    }

}
