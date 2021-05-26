package Replit_And_Practice_Tasks.Second_Week_Practice;

import java.util.Scanner;

public class GiftCard {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String itemName = scan.nextLine();

        int balance = 100;
        int price = 0;

        if (itemName.equals("Blanket")) {
            price += 60;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - price)+ "$");

        } else if (itemName.equals("Charger")) {
            price += 25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - price)+ "$");

        } else if (itemName.equals("Hat")) {
            price += 25;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - price)+ "$");

        } else if (itemName.equals("Headphones")) {
            price += 30;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - price)+ "$");

        } else if (itemName.equals("Laptop")) {
            price += 200;
            System.out.println("Sorry, not enough funds on your gift card!");

        } else if (itemName.equals("Pants")) {
            price += 50;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - price)+ "$");

        } else if (itemName.equals("Pillow")) {
            price += 40;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - price)+ "$");

        } else if (itemName.equals("Smartphone")) {
            price += 1000;
            System.out.println("Sorry, not enough funds on your gift card!");

        } else if (itemName.equals("Socks")) {
            price += 5;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - price)+ "$");

        } else if (itemName.equals("USB cable")) {
            price += 10;
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (balance - price) + "$");

        } else {
            System.out.println("Invalid item!");
        }


    }
}
