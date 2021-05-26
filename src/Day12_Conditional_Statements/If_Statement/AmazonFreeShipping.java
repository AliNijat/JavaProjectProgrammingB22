package Day12_Conditional_Statements.If_Statement;

import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the prices amount");

        double price1 = scan.nextDouble();
        double price2 = scan.nextDouble();

        if (price1 + price2 >= 25){
            System.out.println("Your total purcheses is: " + (price1 + price2) +
                    " $ you orders are eligible for free shipping");
        }else {
            System.out.println("Your total purchese is: " + (price1 + price2) +
                    " $ you orders aren't eligible for free shipping");
        }
        System.out.println("THANK YOU FOR SHOPPING WITH AMAZON");

    }
}
