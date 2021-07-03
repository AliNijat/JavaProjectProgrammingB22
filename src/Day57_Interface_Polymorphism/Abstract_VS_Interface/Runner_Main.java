package Day57_Interface_Polymorphism.Abstract_VS_Interface;

public class Runner_Main {
    public static void main(String[] args) {

        // 1- We cannot create object of Abstract and Interface
       /**
        AbstractA a = new AbstractA();
        InterfaceA i = new InterfaceA();
        */

       // 2- Class can extends 1 abstract and imple many Interface class
       // public class Normal_ConcreteA extends AbstractA implements InterfaceA, InterfaceB{}
        // Marker Interface > interface without any Variables and methods

        InterfaceA.staticMethodE("Agsfagz_Dewooneh");
    }
}
