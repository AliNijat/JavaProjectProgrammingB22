package Replit_And_Practice_Tasks.Methods_Tasks;

public class ReverseString {
    public static void main(String[] args) {
        String str = "foo";
        System.out.println(reverse(str));

    }
    public static String reverse (String input){
      //  String str = "student";
        String reverse = "";
        for (int i = input.length()-1; i >=0; i--) {
            reverse += input.charAt(i);

        }
       // System.out.println(reverse);
        return reverse;
    }
}
