package Day35_CustomMethods_With_Para;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class buildEmail {
    public static void main(String[] args) {

        email();


    }
    public static void email(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your name and then your domain");
       String name = scan.nextLine(), domain = scan.nextLine();
        Random userNum = new Random(10);
        System.out.println("Your email: " +( name.toLowerCase() + userNum) + "@"+ domain.toLowerCase() + ".com");
    }
}
