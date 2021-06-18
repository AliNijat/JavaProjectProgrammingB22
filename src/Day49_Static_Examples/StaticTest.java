package Day49_Static_Examples;

public class StaticTest {

    String word = "Hello";
    public static void main(String[] args) {

        // (1) static method can call by className.methodName
        StaticMethods.displayMessage("hi how are you?");

        // instance methods need to create an object to be called
        // StaticMethods.non_staticMethod();

        StaticMethods stm = new StaticMethods();
        stm.non_staticMethod();

        // (2) static methods can only access other static variables and methods like below example
        // StaticMethods.displayMessage(word);



    }
}
