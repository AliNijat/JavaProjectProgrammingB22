package Extra_Practice.Loop_Practice2;

public class CountOfUpLocaseAndNums {
    public static void main(String[] args) {


        String word = "ALijan1aman23";
        int upperCase = 0;
        int lowerCase = 0;
        int countOfNums = 0;

        for (int i = 0; i <= word.length()-1; i++) {

            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                upperCase++;

            } else if (word.charAt(i) >= 'a' && word.charAt(i) <= 'z') {
                lowerCase++;

            } else if (word.charAt(i) >= '0' && word.charAt(i) <= '9') {
                countOfNums++;

            }
        }
            System.out.println("Count of uppercase letters = " + upperCase);
            System.out.println("Count of lowercase letters = " + lowerCase);
            System.out.println("Count of numbers chars = " + countOfNums);



    }
}
