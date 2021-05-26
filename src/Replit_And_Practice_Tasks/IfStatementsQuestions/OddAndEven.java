package Replit_And_Practice_Tasks.IfStatementsQuestions;
import java.util.*;
public class OddAndEven {

        public static void main(String[] args) {
            //DO NOT TOUCH THESE LINES. TEACHER NEEDS THEM TO TEST YOUR CODE:
            // Variables are already declared and given
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number:");
            int number = input.nextInt();

            //CODE HERE
            if ((number % 2) == 0){
                System.out.println(number + " is even");
            } else {
                System.out.println(number + " is odd");
            }
    }
}
