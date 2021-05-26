package Day05_Primitives_Concatanation;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "iPhone 10";
        String color = "pink";
        double price = 699.0;
        int storage = 256;
        boolean hasCamera = true;

        System.out.println(brand);
        System.out.println(model);
        System.out.println();

        // lest's print with message
        System.out.println("Brand is: " + brand);
        System.out.println("Model is: "+ model);
        System.out.println("Color is: " + color);
        System.out.println("price is: " +"$ " + price);
        System.out.println("Capicity is: "+ "GB " + storage);
        System.out.println("Has Camera? " + hasCamera);

    }
}
