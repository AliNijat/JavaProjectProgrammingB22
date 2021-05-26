package Day14_MultiBranch_IfStatemens;

import java.util.Scanner;

public class CalculatorV1WithScanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Here is no a way to read char input directly by scanner
        // But, we can use char by "next().CharAt(0);"

        System.out.println("Please enter the num1");
        double num1 = scan.nextDouble();
        System.out.println("Please enter the num2");
        double num2 = scan.nextDouble();
        System.out.println("Please enter the operator");
        char operators = scan.next().charAt(0);


        if (operators == '+') {
            System.out.println("Sum of num1 and num2 is: " + (num1 + num2));
        } else if (operators == '-') {
            System.out.println("Subtraction of num1 and num2 is: " + (num1 - num2));
        } else if (operators == '*') {
            System.out.println("Multiplication of num1 and num2 is: " + (num1 * num2));
        } else if (operators == '/') {
            System.out.println("Division of num1 and num2 is: " + (num1 / num2));
        } else {
            System.out.println("Invalid operator.\nValid operators are: +, -, *, / ");
        }

    }
}
