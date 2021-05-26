package Day32_Arrays_Split;

public class MaxAndMinPrice {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDS = {12345, 123456, 12347, 12348, 12349, 12350};

        // first task -->> find and print the most expensive item
        double expinsive = prices[0]; double cheapOne = prices [0];
        int indexMaxPrice = 0; int indexMinPrice = 0;
        for (int i = 0; i < items.length; i++) {
            if (prices[i] > expinsive ){
                expinsive = prices[i];
                indexMaxPrice = i;
            }
            if (prices[i ]< cheapOne ){
                cheapOne = prices[i];
                indexMinPrice = i;
            }

        }
        System.out.println("Expensive items...>> " + itemIDS [indexMaxPrice ] +  " - " + itemIDS[indexMaxPrice] + ": $" + prices [indexMaxPrice] );
        System.out.println("Cheapest items...>> " + itemIDS [indexMinPrice ] + " - " + itemIDS[indexMinPrice] +  ": $" + prices [indexMinPrice] );

    }
}
