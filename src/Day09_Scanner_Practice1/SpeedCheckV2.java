package Day09_Scanner_Practice1;

import java.util.Scanner;

public class SpeedCheckV2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the limit speed");
        int speedLimit = scan.nextInt();

        System.out.println("Enter your current speed");
        int currentSpeed = scan.nextInt();

        int overSpeed = currentSpeed - speedLimit;
        if (speedLimit == currentSpeed){
            System.out.println("You are a good driver! ");
        }else {

            System.out.println("You are driving too fast >> \"" + overSpeed + " MPH\", over the speed limit. Slow down!");
        }


    }
}
