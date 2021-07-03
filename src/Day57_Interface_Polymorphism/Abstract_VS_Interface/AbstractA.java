package Day57_Interface_Polymorphism.Abstract_VS_Interface;

public abstract class AbstractA {

    int num1;
    private double price;
    public static int count;
    public final String type = "Abstract";
    public static final String LANGUAGE = "Java";

    public abstract void absMethodA();
    public void methodB(){
        System.out.println("normal Method called B");
    }
    public static void staticMethodC(){
        System.out.println("Static method called C");
    }
}
