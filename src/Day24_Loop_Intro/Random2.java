package Day24_Loop_Intro;

import java.util.Random;
import java.util.Scanner;

public class Random2 {
    public static void main(String[] args) {

        Random random = new Random();

        Scanner scan = new Scanner(System.in);

        int secretNumber = random.nextInt(101);
        int guessingNum = 0;
        int count = 0;

        do {
            System.out.println("Enter guess number:");
            guessingNum = scan.nextInt();

            if (guessingNum > secretNumber) {
                System.out.println("Wrong, your number is too long");
            } else if (guessingNum < secretNumber) {
                System.out.println("Wrong, your number is too small");
            }
            count++;
            if (count == 3) {
                System.out.println("Exceed number of attempts");
                return;
            }

        } while (secretNumber != guessingNum);
        System.out.println("Congrats! You won! Secret number: " + secretNumber);

    }
}
