package Extra_Practice.Loop_Practice1;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int firstNum = input.nextInt();

        int maxNum = firstNum;
        int minNum = firstNum;

        System.out.println("Enter more numbers");

        for (int i = 1; i < 5; i++) {
            int numbers = input.nextInt();
            if (numbers > maxNum){
                maxNum = numbers;
            }
            if (numbers < firstNum){
                minNum = numbers;
            }
        }

        System.out.println("Max number = " + maxNum);
        System.out.println("Min number = " + minNum);

    }
}
