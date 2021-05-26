package Replit_And_Practice_Tasks.Scanner_Practice;
import java.util.*;
public class PosNegZerNumber {

        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner s = new Scanner(System.in);
            int num = s.nextInt();

            //your code here

            if ( num > 0){
                System.out.println("num = " + num + "\npositive");
            }
            else if ( num < 0){
                System.out.println("num = " + num + "\nnegative");
            }
            else {
                System.out.println("num = " + num + "\nzero");}




    }
}
