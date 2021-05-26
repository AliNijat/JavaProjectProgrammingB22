package Day07_Arithmetic_Operators_Continue;

public class OperatorsPrecedence {
    public static void main(String[] args) {

        System.out.println(10 + 5);                      // 15
        System.out.println(10 + 5 - 3);                  // 12

        System.out.println(10 + 5 - 3 * 2);              // 9
        System.out.println(10 + 5 - 3 / 2 * 3);          // 12

        System.out.println(10 + (5 - 3) / 2 * 3);        // 13

        //System.out.println(10 / 0);                    // not passible ==> Exception in rum time

        System.out.println(10 / 0.1);                    // 100.0

        System.out.println(10 * 0);                      // 0

        System.out.println((3 + 5) * 3);                 // 24
        System.out.println(3 + 5 * 3);                   // 18



    }
}
