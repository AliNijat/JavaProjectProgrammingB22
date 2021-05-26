package Day09_Scanner_Practice1;

import java.util.Scanner;

public class SalaryCalculate {
    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);

        System.out.println("Enter your pay rate please: ");
        double payRate = inPut.nextDouble();

        System.out.println("Enter your weekly hours: ");
        int weeklyHour = inPut.nextInt();

        double monthlyPay = payRate * weeklyHour * 4;
        System.out.println("Your pay in one week is: $" + (payRate * weeklyHour));
        System.out.println("Your monthly pay is: $ " + monthlyPay);

        System.out.println("Enter the months you worked: ");
        int monthlyWorked = inPut.nextInt();

        double annuallySalary = monthlyPay * monthlyWorked;
        System.out.println("Your annually salary is: $" + annuallySalary);


    }
}
