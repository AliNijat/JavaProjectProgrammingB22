package Day16_Switch_Ternary;


public class CappuccinoBuyer {
    public static void main(String[] args) {

        String size = ""; // ", "grande", "venti";
        double price = 0;
        double calories = 0;

        switch (size){
            case "tall":
                price = 2.99;
                calories = 4;
                System.out.println("");

            case "grande":
                price = 3.50;
                calories = 5;
            case "venti":
                price = 3;
                calories = 4.5;
        }
    }
}
