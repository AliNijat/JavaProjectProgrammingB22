package Office_Hours.Practice9_03_17_21;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
         int age = scan.nextInt();

         if (age > 0 && age < 120){
             if (age <= 2){
                 System.out.println("Infant");
             }else if (age >= 3 && age <= 5){
                 System.out.println("Toddler");
             }else if (age >= 6 && age <= 9){
                 System.out.println("Senior");

                 // TODO: The rest will be continue from here with else if ....
             }


         }else {
             System.out.println("Invalid age");
         }

    }
}
