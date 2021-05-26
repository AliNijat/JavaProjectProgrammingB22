package Office_Hours.Practice9_03_17_21;

import java.util.Scanner;

public class SimpleCode {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        if ( num < 0 && num > 0){
            System.out.println(" Enter a positive number");
             num = scan.nextInt();

             if (num > 50){
                 num += 2000;
             }

        }else if (num <= 100){
            System.out.println(" Bigger number, subtracted 50");
            num -= 50;


        }else {

        }


    }
}
