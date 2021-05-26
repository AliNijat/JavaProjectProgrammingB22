package Replit_And_Practice_Tasks;

import java.util.*;

public class SecondsConverter {
    public static void main(String[] args) {


        //YOUR CODE HERE:
        Scanner inputSeconds = new Scanner(System.in);
        System.out.println("Enter seconds:");
        int second = inputSeconds.nextInt();

        int hours = second / 3600;
        int remainderAfterHour = second % 3600;
        int minutes = remainderAfterHour / 60;
        int seconds = remainderAfterHour % 60;


        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);

    }
}
