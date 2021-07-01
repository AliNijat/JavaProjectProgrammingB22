package Day49_Static_Examples;

public class StaticMethods {

    int num = 10;
    static int count = 0;
    public static void displayMessage(String message){
        System.out.println("Message: " + message);
        // System.out.println("Num: " + num);   -> ERROR: num is instance variable.static cannot access
        System.out.println("Count: " + count);  // no error. count is static variable
    }

    public static void anotherStaticMethod(){
        System.out.println("Another static method");
        displayMessage("Wooden spoon");
    }

    // StaticMethods.instanceMethod(); -> no
    // StaticMethods stm = new StaticMethods();
    // stm.non_staticMethod();

    public void non_staticMethod(){
        System.out.println("instance Method");
        System.out.println("num = " + num);
        System.out.println("count = " + count);
    }
}
