package Replit_And_Practice_Tasks.Methods_Tasks;

public class CountLetters {
    public static void main(String[] args) {

       String count = countLetters("qqwweerrttyyjkl");
        System.out.println(count);

    }
    public static String countLetters(String letters) {
        //String letters = "aaabbbccddd";
        String countofletters = "";
        int countL = 0;

        for (int i = 0; i < letters.length(); i++) {
            countL = 0;
            for (int j = 0; j < letters.length(); j++) {
                if (letters.charAt(i) == letters.charAt(j)) {
                    countL++;
                }
            }
            if (!countofletters.contains("" + letters.charAt(i))) {
                countofletters += countL + "" + letters.charAt(i);
            }

        }
        return countofletters;
       // System.out.println(countofletters);
    }
}
