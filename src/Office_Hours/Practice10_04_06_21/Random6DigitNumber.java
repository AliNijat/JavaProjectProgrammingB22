package Office_Hours.Practice10_04_06_21;

import java.util.Random;

/*
CHALLENGE – THIS WILL MAY BE DIFFICILT BUT TRY IT. DON’T SPEND TOO MUCH TIME
Generate a random number that is six digits long. Each digit in this number should be unique, meaning the number 6 digit number should have 6 different character numbers that make it up. Print the number.
HINTS: Loops, Strings, Random
 */
public class Random6DigitNumber {
    public static void main(String[] args) {

        Random random = new Random();

        String randomNumber = "";

       while (randomNumber.length() != 6){

           int eachRandom = random.nextInt(10);

           if (!randomNumber.contains(""+ eachRandom)){
               randomNumber += eachRandom;
           }
       }
        System.out.println("My random number is = " + randomNumber);



    }
}
