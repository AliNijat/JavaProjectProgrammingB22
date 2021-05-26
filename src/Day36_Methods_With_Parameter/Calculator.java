package Day36_Methods_With_Parameter;

public class Calculator {
    public static void main(String[] args) {

        add(23, 2.50);
        sub(21, 10);
        multi(5, 10);
        divide(200, 20);

    }
    //-----------------
    public static double add (double num1, double num2){
        double sumOf = num1 + num2;
        System.out.println("Sum of " + num1 + " + " + num2 + " = " + sumOf);
         return sumOf;
    }
    public static double sub (double num1, double num2){
        double sumOf = num1 - num2;
        System.out.println("Minus of " + num1 + " - " + num2 + " = " + sumOf);
        return sumOf;
    }
    public static double multi (double num1, double num2){
        double sumOf = num1 * num2;
        System.out.println("Multiply of " + num1 + " * " + num2 + " = " + sumOf);
        return sumOf;
    }
    public static double divide (double num1, double num2){
        double sumOf = num1 / num2;
        System.out.println("Division of " + num1 + " / " + num2 + " = " + sumOf);
        return sumOf;
    }


}
