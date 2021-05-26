package Replit_And_Practice_Tasks.LoopsTasks;

import java.util.Scanner;

public class PrintAsterisksNtime {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        int n = a.nextInt();


        for (int i = 1; i <= n ; i++) {

            System.out.print("*");

        }
    }
}
