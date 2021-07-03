package Day57_Interface_Polymorphism.Abstract_VS_Interface;

public abstract class AbstractA {

    int num1;
    private double price;
    public static int count;
    protected final String type = "Abstract";
    static final String LANGUAGE = "Java";

    // No private, final and static
    public abstract void absMethodA();

    public void methodB(){
        System.out.println("normal Method called B");
    }

    public static void staticMethodC(){
        System.out.println("Static method called C");
    }

    // Constructor method
    public AbstractA(){
        System.out.println("Constructor method from AbstractA class");
    }
}
