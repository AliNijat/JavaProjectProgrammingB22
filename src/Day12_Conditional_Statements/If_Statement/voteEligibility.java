package Day12_Conditional_Statements.If_Statement;

import java.util.Scanner;

public class voteEligibility {
    public static void main(String[] args) {
        Scanner inPut = new Scanner(System.in);
        System.out.println("Please enter your age!");

        byte age = inPut.nextByte();
        if (age >= 18){
            System.out.println("You are eligible to vote, you are an adult already");
            System.out.println("Cause your age is greater or equal to 18");
        }else {
            System.out.println("You are not eligible to vote, go first finish your school");
            System.out.println("Cause your age is less than 18");
        }
    }
}

