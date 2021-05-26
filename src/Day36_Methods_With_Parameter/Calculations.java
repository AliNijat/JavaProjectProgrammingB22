package Day36_Methods_With_Parameter;

public class Calculations {
    public static void main(String[] args) {

        Calculator.add(100, 200);
        Calculator.sub(100, 200);
        Calculator.multi(100, 200);
        Calculator.divide(100, 200);
        
        double d1 = 20.21;
        double d2 = 200;
        double result = Calculator.multi(d1, d2);
        System.out.println("result = " + result);
    }
}
