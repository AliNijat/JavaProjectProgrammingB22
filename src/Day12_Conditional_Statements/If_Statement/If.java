package Day12_Conditional_Statements.If_Statement;

import java.util.Scanner;

public class If {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your score please: ");

        int yourGrade = scan.nextInt();
        if (yourGrade >= 60 ){
            System.out.println("Congragelation you passed the exam! your scores are: " + yourGrade);
        }else {
            System.out.println("Unfurtunately, your scores are less you failed the exam, your scores are: " + yourGrade);
        }


    }
}
