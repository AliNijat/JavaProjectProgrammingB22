package Extra_Practice.Loop_Practice1;

import java.util.Scanner;

public class DynamicAlphabet {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want uppercase or lowercase letters?");
        String answer = scan.nextLine();
        System.out.println("Do you like to ascending or descending order?");
        String orderOfLetters = scan.nextLine();

        char start ;
        char end ;

        if (answer.contains("upper")){
            start = 'A';
            end = 'Z';
        }else {
            start = 'a';
            end = 'z';
        }

        if (orderOfLetters.contains("ascending")){
            for (int i = start; i <= end ; i++) {
                System.out.print((char) i + " ");
            }
        }else if (orderOfLetters.contains("descending")){
            for (int i = end; i >= start ; i--) {
                System.out.print((char) i + " ");

            }
        }




    }
}
