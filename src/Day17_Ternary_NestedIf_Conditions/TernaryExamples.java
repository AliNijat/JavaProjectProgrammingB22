package Day17_Ternary_NestedIf_Conditions;

import java.util.Scanner;

public class TernaryExamples {
    public static void main(String[] args) {

        System.out.println("------------------------------");
        System.out.println("___________With If Statements__________");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first the score then the quality:");

        int score =input.nextInt();
        String quality =input.next();

        if (score > 60 ){
            System.out.println("Pass");
        }else if (score < 60){
            System.out.println("Fail");
        }else if (quality.equals("good")){
            System.out.println(90 );
        }else if (!quality.equals("good")){
            System.out.println(0);
        }else if (score > 90){
            System.out.println('A');
        }else if (score < 90) {
            System.out.println('B');
        }else if (score % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("Odd");
        }

        System.out.println("------------------------------");
        System.out.println("___________With Ternary__________");
        String result = (score > 60)? "pass" : "fail";
        System.out.println(result);

        int rating = (quality.equals("good")) ? 100 : 0;
        System.out.println(rating);

        char grade = (score > 90) ? 'A' : 'B';
        System.out.println(grade);

        String evenOdd = (score %2 == 0) ? "even" : "odd";
        System.out.println(evenOdd);



    }
}
