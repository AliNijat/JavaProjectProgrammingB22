package Day18_Conditions_practice;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Double score = scan.nextDouble();
        String result = score > 0 ? "Ex" : score < 0 ? "Fail" : "good";
        System.out.println(result);

        int num = scan.nextInt();
        if (num == 1)
            System.out.println("It is dependent statement / first statement"); // will not print out
        System.out.println("It is independent statement / second statement");  // will print out

        if (num == 2)
            System.out.println("It's dependent statement / third statement"); // print out too
        System.out.println("It is independent statement / forth statement"); // will print as well
    }
}
