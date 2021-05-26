package Office_Hours.Practice3_03_15_21;

public class OperatorAnalyze {
    public static void main(String[] args) {

        /**
         Analyze the following without intellij
         Calculate the output statement
         */
        int a = 5;
        int b = a++ + a-- + a * 2 + a + ++a;
        //       5  +  6 + 5 * 2 +  5 + 6
        //       5 + 6 +  10 + 5 + 6 ==> 32
        System.out.println(a + "\n" + b);
        System.out.println("-----------------------");

        int c = 200;
        int d = -c++ + - --c * c-- % 2 +c;
        //     -200 + - 200 * 200 % 2 + 199
        //     - 200 + -200 * 0 + 199
        //     - 200 + 0 + 199
        //      - 200 + 199
        //       -1
        System.out.println(c + "\n" + d);

    }
}
