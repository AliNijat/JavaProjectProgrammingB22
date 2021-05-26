package Day11_Comparison_Operators;

public class PrePostIncrDecreOperators2 {
    public static void main(String[] args) {

        int num1 = 10;                    num1++;   System.out.println(num1);

        int num2 = ++num1; //
        System.out.println("num1 = " + num1);       System.out.println("num2 = " + num2);
        System.out.println("__________________");

        ++num1;         // 13
        num2 = num1++;
        System.out.println("num1 = " + num1);       System.out.println("num2 = " + num2);


    }
}
