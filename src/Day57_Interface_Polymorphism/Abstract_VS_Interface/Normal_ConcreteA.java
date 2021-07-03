package Day57_Interface_Polymorphism.Abstract_VS_Interface;

public class Normal_ConcreteA extends AbstractA implements InterfaceA, InterfaceB {

    @Override
    public void absMethodA() {
        System.out.println("Abstract Method Called A, it is from Abstract A Parent class");
    }

    @Override
    public void methodB(){
        System.out.println("Method B overridden version is called");
    }
    // @Override  -> static methods are hidden, not overridden
    public static void staticMethodC(){
        System.out.println("Static method C hidden version is called");
    }

    @Override
    public void absMethodA(int num) {
        System.out.println("Abstract method A overridden version is called");
    }
}
