package Day57_Interface_Polymorphism.Abstract_VS_Interface;

public interface InterfaceA {

    public static final String TYPE = "interface";
    double MAX_COUNT = 500;

    // All access modifier is public
    public abstract void absMethodA(int num);

    // TODO ..>> Aftar Java 1.8 static and default methods are allowed in Interface Class
    public static  void staticMethodE(String str){
        System.out.println("Static method E is called with str = " + str);
    }

    public default void defaultMethodF(){
        System.out.println("default method F is called");
    }

    // TODO >> No constructor allowed for interface
}
