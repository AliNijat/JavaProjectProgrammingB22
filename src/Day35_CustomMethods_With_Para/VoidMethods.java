package Day35_CustomMethods_With_Para;


public class VoidMethods {
    public static void main(String[] args) {
        printAlphabetAToZ();
        printAlphabetaToz();
        printSpecialChar();
        System.out.println();
        displayUSFlag();

        System.out.println();
    }
    public static void printAlphabetAToZ(){
        for (char i = 'A'; i <= 'Z' ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAlphabetaToz(){
        for (char i = 'a'; i <= 'z' ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printSpecialChar(){
        for (char i = 33; i <= 96 ; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

   // displayUSFlag
   // This method should print flag of USA in console.

          //  Code for this:

    public static void displayUSFlag() {
        String p1 = "* * * * * * ===========================================\n * * * * *  ===========================================";
        String p2 = "=======================================================";
        for (int i = 0; i < 4; i++) {
            System.out.println(p1);
        }
        System.out.println("* * * * * * ===========================================");
        for (int i = 0; i < 6; i++) {
            System.out.println(p2);
        }
    }
}
