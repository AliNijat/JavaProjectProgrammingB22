package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Scanner;

public class MethodMax {
    public static int max(int x, int max){
        // Code here

        if (max > x){
            return max;
        }else {
            return x;
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));

        max(2, 4);
    }
}
