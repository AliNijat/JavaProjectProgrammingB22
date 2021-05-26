package Day20_StringMenipulation_PracticeContinue;

public class EmptyMethod {
    public static void main(String[] args) {


        String word = "";
        String word2 = " ";
        String word3 = " Ali Nijat ";

        System.out.println(word.length()); // 0
        System.out.println(word.isEmpty()); // true
        System.out.println(word2.isEmpty()); // false

        System.out.println(word3.isEmpty()); // false
        System.out.println(word3.length());  // 11

        System.out.println(word2.length()); // 1

        String veggie = "carrots";

        System.out.println(veggie.isEmpty()); // false
        if (!veggie.isEmpty()){
            System.out.println("we have : " + veggie);
        }
        String drink;
        // System.out.println(drink.isEmpty()); it's made error because the drink variable is not assigned to any value

    }
}
