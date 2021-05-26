package Day25_Dowhile_ForLoop;

import java.util.Scanner;

public class ScannerWithLoop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int starts = scan.nextInt();
        int end = scan.nextInt();
        int num = 0;
        for (int i = starts ; i <= end; i ++){

            num =  i;
            System.out.print( "\n" + i + " ");
            System.out.print("numbers = "  + num + " ");

        }


    }
}
