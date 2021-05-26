package Office_Hours.Practice9_03_17_21;

public class HouseBuyer {
    public static void main(String[] args) {


        String name = "Canyon";
        double price, rating;
        boolean grade, allowsPets;

        switch (name) { // switch can use a value
            case "Hills":
                price = 89000;
                rating = 4.0;
                grade = false;
                allowsPets = true;
                System.out.println("Hi");
                break;
            case "Oak":
                price = 75000;
                rating = 4.5;
                grade = false;
                allowsPets = true;
                break;
            case "Highland":
                price = 150000;
                rating = 4.5;
                grade = true;
                allowsPets = true;
                break;
            case "Canyon":
                price = 100900;
                rating = 4.1;
                grade = false;
                allowsPets = true;
                break;
            default:
                name = "Invalid name";
                price = 0;
                rating  = 0;
                grade = false;
                allowsPets = false;
        }
        System.out.println("name = " + name);
        System.out.println("price = " + price);
        System.out.println("rating = " + rating);
        System.out.println("grade = " + grade);
        System.out.println("allowsPets = " + allowsPets);
    }
}
