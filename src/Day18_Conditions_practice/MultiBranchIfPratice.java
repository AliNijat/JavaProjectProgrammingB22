package Day18_Conditions_practice;

import java.util.Scanner;

public class MultiBranchIfPratice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        // with multy if statement
        if (number > 0){
            System.out.println(number + " is Positive");
        }else  if (number < 0){
            System.out.println(number + " is negative");
        }else {
            System.out.println(number + " is zero");
        }

        // with Ternary statement
        String result = number > 0 ? "Positive" : number < 0  ? "Negative" : "Zero";
        System.out.println(result);
    }
}
