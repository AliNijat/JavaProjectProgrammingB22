package Day48_Constructor_Static.Static_Example;

public class CalculatorTest {
    public static void main(String[] args) {

        // add is static method, can be called using classname.staticMethodName
        // static way of calling the method
        Calculator.Add(40, 30); // 70

        // Calculator.Multiply(3, 5);
        // -> ERROR, above multiply is not static. need object to call it
        // it calls instance method, and we are creating object then calling it.
        Calculator calculator = new Calculator();
        calculator.Multiply(10, 5); // 50

        // static method can also be called using object too.
        calculator.Add(10, 20); // 30
    }
}
