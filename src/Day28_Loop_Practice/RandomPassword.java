package Day28_Loop_Practice;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {

        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_! @#$%^&*\"";

        String password = "";

        Random random = new Random();

        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(71);
            System.out.print(source.charAt(index));

            password += source.charAt(index);

          //System.out.print(random.nextInt(source.length()-1) + " ");

        }

        System.out.println("\nYour password: " + password);
        //main(null);


        String str = "Hi you are you";
        if (str.length() >= 2){
            String result = str.substring(0, str.length()-1);
            System.out.println(result);
        }
    }
}
