package Day09_Scanner_Practice1;

import java.util.Scanner;

public class ScannerInputResutl {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number please: ");
        int firstNum = scan.nextInt();
        // System.out.println("Enter your second number please: ");
        int secondNum = scan.nextInt();

        System.out.println("The result is: " + (firstNum + secondNum));

       // scan.close();


    }
}
