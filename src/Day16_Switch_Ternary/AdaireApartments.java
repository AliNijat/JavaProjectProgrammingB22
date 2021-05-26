package Day16_Switch_Ternary;

public class AdaireApartments {
    public static void main(String[] args) {

        System.out.println("Welcome to Adaire Apartments ");
        int numOfBed = 3;
        double price = 1;

        switch (numOfBed){
            case 1:
                price = 1400;
                System.out.println( numOfBed + " Bedroom selected, Staring price: $" +price );
                break;

            case 2:
                price = 2750;
                System.out.println( numOfBed + " Bedrooms selected, Staring price: $" +price );
                break;

            case 3:
                price = 3350;
                System.out.println( numOfBed + " Bedrooms selected, Staring price: $" +price );
                break;

            default:
                System.out.println( numOfBed + " Bedrooms apartment is not available for now " );
                break;
        }

    }
}
