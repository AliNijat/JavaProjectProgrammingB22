package Day38_Recursion_Methods;

import java.util.Locale;

public class Guava_Methods {
    public static void main(String[] args) {
        isNullOrEmpty(" ");
        System.out.println(isNullOrEmpty(""));
        String word = "Hi how are?";

        word = null;
      //  System.out.println(word.toUpperCase());

        System.out.println("= " + isNullOrEmpty(word));
        word = "";
        System.out.println(isNullOrEmpty(word));
    }
    public static boolean isNullOrEmpty(String str){
        if (str==null || str.length()==0 | str.isEmpty() | str.equals("")) {
            return true;
        }
        return false;
    }
}
