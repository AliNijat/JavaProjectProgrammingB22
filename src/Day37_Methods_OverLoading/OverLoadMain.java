package Day37_Methods_OverLoading;

import java.util.Arrays;

public class OverLoadMain {
    public static void main(String firstName) {

        String lastName = "Nijat";
        System.out.println(""+ firstName.substring(0,1) + lastName.substring(0,1));

    }

    public static void main(String[] args) {
        System.out.println("Hello from real main method");

        System.out.println(Arrays.toString(args));

        System.out.println();
        System.out.println("The bellow is your main method overloaded");
         main("Jahan");

    }
}
