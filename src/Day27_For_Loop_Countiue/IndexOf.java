package Day27_For_Loop_Countiue;

public class IndexOf {
    public static void main(String[] args) {

        String word = "github";
        char letter = 'h';
        int index = -1;

        for ( index = 0; index < word.length(); index++) {

            if (word.charAt(index) == letter){
                System.out.println("letter " + letter + " at " + word + " is in index = " + index);
            }
        }
    }
}
