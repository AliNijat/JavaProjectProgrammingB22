package Replit_And_Practice_Tasks.Methods_Tasks;

public class PalindromeWords {
    public static void main(String[] args) {


       String   check = "ali";

        String reverse = "";

        for (int i = check.length() -1 ; i >=0 ; i--) {
            reverse += check.charAt(i);
        }
        boolean re = true;
        boolean rr = false;
        if (check.replace(" ", "").equalsIgnoreCase(reverse.replace(" ", ""))){
          //  return re;
        }else {
           // return rr;
        }


    }
}
