package Replit_And_Practice_Tasks;

import java.util.Scanner;

/*
A fast food company has two main order types, burger meal and chicken meal.

Both have the same prices, so if a cashier enters "burger" or "chicken " he will get the same price of 10.0.

If the order is burger price is 10.0
If the order is chicken price is 10.0
If the order is soda price is 2.0
If the order is fries price is 3.5
hint: or operator in java is ||

Examples:

burger

10.0
burger

10.0
chicken

10.0
chicken

10.0
soda

2.0
 */
public class BergerOrChicken {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String in = s.next();

        //your code here
        double price = 0;
        if (in.equals("burger") || in.equals("chicken") || in.equals("Burger") || in.equals("Ckicken")) {
            price = 10.0;
            System.out.println(price);
        } else if (in.equals("soda") || in.equals("Soda")) {
            price = 2.0;
            System.out.println(price);
        } else {
            price = 3.5;
            System.out.println(price);
        }
    }
}
