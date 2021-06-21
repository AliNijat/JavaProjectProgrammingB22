package Day55_Abstraction.interface_Demo;

public interface MyInterface {

    public abstract void learn();
}

interface MyInterface2{

}

class MyClass implements MyInterface {

    @Override
    public void learn() {
        System.out.println("Learning Interface and Abstract...!!!");
    }
}

class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();

    }
}