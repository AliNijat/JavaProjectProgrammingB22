package Day11_Comparison_Operators;

public class PrePosPractice {
    public static void main(String[] args) {

        // 1. Simple Example
        int apples = 10;
        //                   10 +  9 / 2 *            11 -     10 => 44
        int totalApples = apples-- + apples++ / 2 * ++apples - --apples;
        System.out.println(totalApples);  // 44

        // 2. Middle Example
        //           9        - 4 * 9 /         10    + 10 => 9 - 3 + 10 => 16
        int basket = --apples - 4 * apples++ / apples-- + ++apples;
        System.out.println(basket);   // 16

        // Hard/Complacated Example
        //               11     +  15     /   10    -  10       *  2 _   15     +   44 ==>> 11 + 1 - 20 - 15 + 44 => 21
        int students = ++apples + --basket / --apples - apples++ * 2 - basket-- + totalApples++;
        System.out.println(students);  // 21


    }
}
