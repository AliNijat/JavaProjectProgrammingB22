package Replit_And_Practice_Tasks;

import java.util.Scanner;

public class TextLeght {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the text:");

        String text = scan.nextLine();
        System.out.println("Length is: " + text.length());

        System.out.println();

    }
}
