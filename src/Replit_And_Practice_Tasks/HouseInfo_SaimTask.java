package Replit_And_Practice_Tasks;

public class HouseInfo_SaimTask {
    public static void main(String[] args) {

        String housType = "Townhouse";
        int numOfBeds = 5;
        int numOfBath = 3;
        int numOfKitch = 2;

        boolean hasBase = true;
        boolean isAttic = false;
        boolean isPool = false;
        boolean forSale = true;

        double price = 3400000;

        String address = "43398 court well, Aliabad fairfax, VA";

        int zibcode = 20225;

        boolean isParkNear = true;

        double schoolRating = 4.94;

        System.out.println(" The house type is: " + housType + "\n The number of bedrooms are: "+ numOfBeds +
                           " \n The number of bathrooms are: " + numOfBath + "\n The number of kitchens are: " + numOfKitch +
                           " \n Is there a basement in this house? Yes, " + hasBase + "\n Is there an attic? No, "  +isAttic +
                           " \n Is there a park near? Yes, " + isParkNear + "\n The school rating in this area is: " + schoolRating +" * " +
                           " \n Has this house access to pool? No, " + isPool + "\n Is this house for sale:? Correct, " + forSale +
                           " \n The house's price is: $" + price + "\n Address: " + address + "\t" + zibcode

        );


    }
}
