package Day17_Ternary_NestedIf_Conditions;

import java.util.Scanner;

public class VendingNestedIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String selection = scan.next();
        String drink = scan.next();
        String snack = scan.next();

        if (selection.equals("drink")){
            if (drink.equals("tea")){
                System.out.println(drink + " selected");
            }else {
                System.out.println(drink + " selected");
            }
        }else if ( selection.equals("snack")){
            if (snack.equals("chips")){
                System.out.println(snack + " selected");
            }else {
                System.out.println(snack + " selected");
            }
        }
    }
}
