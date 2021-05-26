package Day17_Ternary_NestedIf_Conditions;

public class AmazonPrimeShopping {
    public static void main(String[] args) {

        int itemPrice = 30;
        boolean itemPrimeMembership = true;

        if (!itemPrimeMembership) {
            System.out.println("Eligible for free two days shipping");
        } else {
            if (itemPrice > 25) {
                System.out.println("Your order is eligible for free shipping");
            } else {
                System.out.println("Buy some ore if want free shipping");
            }

        }


    }
}
