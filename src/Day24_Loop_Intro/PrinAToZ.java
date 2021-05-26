package Day24_Loop_Intro;

public class PrinAToZ {
    public static void main(String[] args) {

        char alphabet = 'a';

        /*int i = 0;
        System.out.println("Letter = " + alphabet);
        alphabet ++;
        System.out.println("Letter = " + alphabet);
        System.out.println("---------------VVV-------------");


         */

        alphabet = 'a';
        while (alphabet <= 'z'){

            System.out.print(" " + alphabet + " ");
            alphabet++;
        }
        System.out.println();

        alphabet = 'z';
        while (alphabet >= 'a'){
            System.out.print(" " + alphabet + " ");
            alphabet--;
        }

    }
}
