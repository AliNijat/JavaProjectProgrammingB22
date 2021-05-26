package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Scanner;

/*
Finish the profits method which accepts the buyPrice(int) and sellPrice(int) and determines if there was a profit or loss.

It returns a string value that can be "profit","loss","no loss"

Example

profits(100,1500)

returns: "profit"
profits(100,1500)

returns: "profit"
profits(20,5)

returns: "loss"
profits(20,5)

returns: "loss"
profits(100,100)

returns: "no loss"
 */
public class Profits {
    public static void profits(int sellPrice, int buyPrice) {

        if (sellPrice > buyPrice) {
         //   return "profit";
        } else if (sellPrice < buyPrice) {
         //   return "loss";
        } else {
         //   return "no loss";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.println(profits(in.nextInt(), in.nextInt()));

    }
}
