package Day11_Comparison_Operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {

boolean isItBreakTime = true;
        System.out.println(10 == 10);
        System.out.println("Is It Break Time =? " + isItBreakTime);

        System.out.println(15 > 12);      // true
        System.out.println( 15 < 18);     // true
        System.out.println(15 >= 14);     // true
        System.out.println(15 <= 16);     // true
        System.out.println(15 != 9);      // true
        System.out.println(-100 != 44);   // true
        System.out.println(15.90 > 90.9); // false
        System.out.println(10 <= 10);     // true
        System.out.println("__________________________-");

        int a = 100;
        int b = 200;
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a <= b);
        System.out.println(a >= b);
        System.out.println("__________________________-");

        // boolean result = 5; it's make error cause it's a integer
        boolean result = 5 == 5;
        System.out.println("Result = " + result);

        result = 33 >= 23;
        System.out.println("result = " + result);

        result = 33 != 30;
        System.out.println("result = " + result);

        result = 20 < 10;
        System.out.println("result = " + result);

        String city = "Chantilly";
        System.out.println(city == "Chantilly");

        System.out.println(city == "Fairfax");
        // System.out.println(city >= "Chantilly"); // It can't compare
        System.out.println(city != "Reston");

        String name = "Nadir";
        boolean checkName = name == "Soft Skill";
        System.out.println(checkName);
        System.out.println(name != "Soft Skill");




    }
}
