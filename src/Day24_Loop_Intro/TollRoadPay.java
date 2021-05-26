package Day24_Loop_Intro;

import java.util.Scanner;

public class TollRoadPay {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("This machine accept only cash, bills $1 and $5");

        int cash = scan.nextInt();
        int tollfee = 2;
        while (tollfee == cash || cash == 1){
            if (cash == 1){
                System.out.println("Please add one more dollar");
                cash = scan.nextInt();
                cash += cash;
            }
            if (cash == 2){
                System.out.println("You paid $" + tollfee);
                tollfee += 2;
            }else if (cash == 5){
                System.out.println("You paid $" + tollfee + " and take back $" + (cash - tollfee));
                tollfee += 4;

            }else {
                System.out.println("Please enter only bills $1 and $5");
            }
            System.out.println("Thank you, Curry on! ");
        }
        System.out.println("Invalid amount, please try again!");


    }
}
