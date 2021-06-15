package Day48_Constructor_Static.Static_Example;

public class CalculatorTest {
    public static void main(String[] args) {

        // add is static method, can be called using classname.staticMethodName
        // static way of calling the method
        Calculator.add(40, 30); // 70

        // Calculator.Multiply(3, 5);  -> ERROR, multiply in not static. need object to call it
        // it calls instance method, and we are creating object then calling it.
        Calculator calculator = new Calculator();
        calculator.Multiply(10, 5); // 50
        calculator.add(10, 20); // 30
    }
}
