package Replit_And_Practice_Tasks.ArrayTasks;

public class MergingString {
    public static void main(String[] args) {
        // System.out.println(mergeStrings("ali", "123"));

        String word = "ali";
        String word1 = "12398";
        String tep = "";
        String result = "";

        int le1 = word.length() + word1.length();
        System.out.println(le1);

        System.out.println(tep);

        int i, j = 0;
        for (i = 0; i < word.length(); i++) {
            tep += word.charAt(i);
        }
        for (j = 0; j < word1.length(); j++) {
            tep += word1.charAt(j);
        }
        System.out.println(tep);

    }
}
