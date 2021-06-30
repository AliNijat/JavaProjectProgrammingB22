package Extra_Practice.OOP_Examples;

public class TypeOfVariables {

    //  TYPE OF VARIABLES:
    // 1- local variables -> Declaring inside a method and as method's parameters.
    //                       - not accessible outside of method
    //                       - do not get default value
    // 2- instance variables -> Declared inside a class not inside a method
    //                          - always get a default value(properties).
    //                          - con not re-initialize directly within the class
    // 3- static variables -> Declaring inside the class but only one copy per class

    static boolean staticVariable = true;          // static variable is accessible inside this class
    int instanceVariable = 32;                     // instance variable is accessible in whole it's class
    // instanceVariable = 30

    public void method(){
        String localVariable = "Ali";              // local variable is accessible only within it's method
        System.out.println(localVariable);
        instanceVariable = 500;
    }
    public void method2(float localVariable2 ){    // local variable is accessible only within it's method
        localVariable2 = 300;
        System.out.println(localVariable2);
        // static int age = 20;                    -> we can't declare inside a regular methods
    }

    public static void method3(){
       //  static int year = 100;                  -> we can't declare inside a static methods
    }

    public static void main(String[] args) {

        // static int age = 80;                                -> we can't declare inside main method
        TypeOfVariables classObject = new TypeOfVariables();

        System.out.println(classObject.instanceVariable);         // can use with classObject only
        // System.out.println(TypeOfVariables.instanceVariable);  // cannot use with className
        System.out.println(TypeOfVariables.staticVariable);       // can use by calling className only
        classObject.method();                                     // can use by calling class objectName and methodName only
        classObject.method2(20);                       // can use by calling class ObjectName and methodName only

        String word = "Cybertek";
        String r = word.substring(word.length()-3);
        System.out.println(r);

    }
}
