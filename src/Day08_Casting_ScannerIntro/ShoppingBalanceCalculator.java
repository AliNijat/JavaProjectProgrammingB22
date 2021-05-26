package Day08_Casting_ScannerIntro;

public class ShoppingBalanceCalculator {

    public static void main(String[] args) {

        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15.0;
        double total = price1 + price2 + price3;

        double taxes = 3.97;
        double groundTotal =  total + taxes;

        double remainingBalance =balance - price1 - price2 - price3;
        double remainingBalance2 =balance -( price1 + price2 + price3);

        System.out.println("Your initial balance: $" + balance);
        System.out.println();
        System.out.println("your total bill is: $" + groundTotal);
        // System.out.println(remainingBalance);

        int availableBalanceWithoutCents = (int) remainingBalance;
        System.out.println("Your available balance is: $" + remainingBalance2);
        // System.out.println("Your available balance is: $" + (balance - groundTotal));
        System.out.println();
        System.out.println("Your available balance without cents is: $" + availableBalanceWithoutCents);
        System.out.println("You donated: $" + (remainingBalance-availableBalanceWithoutCents) +
               "\" Thank you! for your supporting to our community!!!");


    }
}
