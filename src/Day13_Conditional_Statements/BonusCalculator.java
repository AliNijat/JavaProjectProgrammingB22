package Day13_Conditional_Statements;

import java.util.Scanner;

public class BonusCalculator {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please the sale amount here");

        double bonus = 0.0;
        int salesAmount = scan.nextInt();

        if (salesAmount <= 1000) {
            bonus = 50;
            System.out.println("Good job, you qualified for bonus!:))\nBonus: = $" + bonus);
        } else {
            bonus = 100;
            System.out.println("Great job, you are qualified for full bonus.\".)\nBonus: = $" + bonus);

        }
        System.out.println("Your bonus for sales amount is $" + bonus);
    }
}
// Shift + alt + L --> for formatting nice the code shapes


