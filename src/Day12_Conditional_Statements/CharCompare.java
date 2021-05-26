package Day12_Conditional_Statements;

public class CharCompare {
    public static void main(String[] args) {

        char letter1 = 'A';
        char letter2 = 'Z';

        boolean isAEgualsToZ = letter1 ==letter2;
        System.out.println(letter1 == letter2);
        System.out.println("Is equals A to Z? " + isAEgualsToZ + " A is " + ((int)'A') + " and Z is " + ((int)'Z'));
        System.out.println("-------------------------------------------------");

        System.out.println(letter1 >= letter2);
        System.out.println(letter1 <= letter2);


        char grade = 'E';
        boolean pass = grade >= 'D';
        System.out.println("Are you passed the exam? - " + pass );




    }
}
