package Day24_Loop_Intro;

import java.util.Scanner;

public class pinCodeDoWhile {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int secPinCode = 1234;
        int pineCode = 0;
       do {
           System.out.println("Enter your pineCode");
            pineCode = scan.nextInt();
            pineCode += 3;
       }while (pineCode == secPinCode );
        System.out.println("pineCode doesn't match");




    }
}
