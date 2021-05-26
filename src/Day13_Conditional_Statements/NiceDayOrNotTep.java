package Day13_Conditional_Statements;

import java.util.Scanner;

public class NiceDayOrNotTep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please the current tempruture degree");

        int temp = scan.nextInt();

        if (temp <= 70){
        System.out.println("It is a good day!\nLets run with coding :))");
        }else {
        System.out.println("It is kind of cold today!\nLets stay at home and drink out java(.\".)");

    }
    }
}
