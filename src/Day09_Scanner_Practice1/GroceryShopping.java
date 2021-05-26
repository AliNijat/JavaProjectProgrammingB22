package Day09_Scanner_Practice1;

import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {

        Scanner inPut = new Scanner(System.in);

        System.out.println("Enter price for milk");

        double milkPrice = inPut.nextDouble();

        System.out.println("Enter price for bread");
        double breadPrice = inPut.nextDouble();

        System.out.println("Enter price for cucumber");
        double cucumberPrice = inPut.nextDouble();

        System.out.println("Milk price: $" + milkPrice);
        System.out.println("Bread price: $" + breadPrice);
        System.out.println("Cucumber price: $" + cucumberPrice);
        System.out.println("Total taxes caculated: $" + 2.89);
        System.out.println("Total shopping in this bill: $" +(milkPrice + breadPrice + cucumberPrice + 2.89));


    }
}
