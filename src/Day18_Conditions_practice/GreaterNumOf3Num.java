package Day18_Conditions_practice;

import java.util.Scanner;

public class GreaterNumOf3Num {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int num1 = n.nextInt();
        int num2 = n.nextInt();
        int num3 = n.nextInt();

        String test = num1 > num1 && num1 < num3 ? num1 + " is largest" : num2 > num1 && num2 > num3 ? num2 +
                                                           " is largest" : num3 + " is largest";
        System.out.println(test);
    }
}
