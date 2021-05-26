package Replit_And_Practice_Tasks.Methods_Tasks;

public class JoinAfter3Char {
    public static void main(String[] args) {

        String target = "longword";
        String word = "foo";

        String after3thChar = target.substring(0, 3);

        System.out.println(after3thChar);

        String result = after3thChar + word + target.substring(3);
        System.out.println(result);
    }
}
