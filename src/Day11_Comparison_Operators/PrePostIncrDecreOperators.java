package Day11_Comparison_Operators;

public class PrePostIncrDecreOperators {
    public static void main(String[] args) {


        int num1 = 1;

         num1++;
        System.out.println(num1);

        ++num1;
        System.out.println(num1);
        System.out.println("--------------");

        int num2 = 5;

        num2--;
        System.out.println(num2);

        --num2;
        System.out.println(num2);
        System.out.println("---------------");

        int num3 = 4;
        int num4 = ++num3;
        int num5 = num3++;
        System.out.println(num4 +" & " +num5);

        int num6 = --num3;
        int num7 = num3++;
        System.out.println(num6 + " & " + num7);


    }
}
