package Day35_CustomMethods_With_Para;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(05);

        int count = 100;
        displayValue(count);
        System.out.println();

        char chars = 'A' ;
        dispalySpecialChars(chars);
        displayMessage("\"what is parameter?\"");
    }

    public static void displayValue(int num) {
        System.out.println("Display Value is: " + num);
    }

    public static void displayMessage(String message) {
        System.out.println("Are you sure <<" + message +">> is your message?");
    }

    public static void dispalySpecialChars(char characters) {
            System.out.println("you mean? " + characters);
    }

}
