package Replit_And_Practice_Tasks.Methods_Tasks;

public class Method_StringWithoutFirstChar {
    public static void main(String[] args) {

        String target = "2dfdaa";
        String result = "";
        for (int i = 1; i < target.length(); i++) {

            result += target.charAt(i);
        }
        System.out.println(result);
    }
}
