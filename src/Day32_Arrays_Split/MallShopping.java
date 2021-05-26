package Day32_Arrays_Split;

public class MallShopping {
    public static void main(String[] args) {

        String[] items = {"Shoes", "Jacket", "Gloves", "Airpods", "Ipad", "iphone 11 case"};
        double[] prices = {99.99, 150.0, 9.99, 250.0, 439.50, 39.99};
        int[] itemIDS = {12345, 123456, 12347, 12348, 12349, 12350};

        System.out.println("Find the index of gloves in items array:");
        for (int each = 0; each <= items.length - 1; each++) {
            // System.out.println("Index of " +items [each] +" is = " + each);

            if (items[each].equals("Gloves")) {
                System.out.println("Index of " + items[each] + " is = " + each);
                break;
            }

        }

        System.out.println("--------Set boolean to true if the first 'iPad' is found");
        boolean iPadExist = false;

        for (int i = 0; i < items.length; i++) {

            if (items[i].equalsIgnoreCase("iPad")) {
                iPadExist = true;
                System.out.println(iPadExist + ", Index of " + items[i] + " is = " + itemIDS[i]);
                break;
            }
        }
        System.out.println("");
        if (iPadExist) {
            System.out.println("We found the ipad and bought it :))");
        } else {
            System.out.println("We forgot the ipad! :(");
        }

        for (int i = 0; i < items.length; i++) {
            System.out.println("\t" + items[i] + ",\t$" + prices[i] + ",\t\tID: " + itemIDS[i]);
        }

        System.out.println("------Look for 'jacket' in items and print all details-------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("jacket")) {
                System.out.println("<" + items[i] + "> <$" + prices[i] + "> Id<" + itemIDS[i] + ">");
                break;
            }
        }

    }
}
