package Day08_Casting_ScannerIntro;

public class Casting_Char_To {
    public static void main(String[] args) {

        char letter = 'M';
        int numletter = letter;
        System.out.println(numletter);
        System.out.println();

        char letter1 = (int) 'M';
        System.out.println(letter1);
        System.out.println(letter);


    }
}
