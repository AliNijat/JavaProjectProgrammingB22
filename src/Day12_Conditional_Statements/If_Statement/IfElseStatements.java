package Day12_Conditional_Statements.If_Statement;

import java.util.Scanner;

public class IfElseStatements {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your passcode");


        int pass = scan.nextInt();
        if (pass > 70){
            System.out.println("Your test passed");
        }else {
            System.out.println("Your test failed");
        }
        System.out.println("_________________________________");

        int count = 25;
        if (count > 30) {
            System.out.println("Count is more than 30");
        }else {
            System.out.println("Count is less than 30");
        }
    }
}
