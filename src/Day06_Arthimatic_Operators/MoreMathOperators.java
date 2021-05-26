package Day06_Arthimatic_Operators;

public class MoreMathOperators {
    public static void main(String[] args) {
        int toyotas = 431, hondas = 233, vws = 2, teslas = 20, inssans = 1, bmws = 155;

        int totalNumOfCars = hondas + vws + teslas + toyotas + inssans + bmws;

        System.out.println(  "There are " + totalNumOfCars + " cars in the parking lot.");
        System.out.println("___________________________________________");

        String pizza = "Hawaiian";
        int slices = 8;
        int peopel = 4;
        int slicesPerPerson = slices / peopel;

        System.out.println("There we got " + slicesPerPerson + " slices per person.");
        System.out.println("We ordered " + pizza + " pizza with " + slices + " slices, "
         + peopel + " people ate" + slicesPerPerson + " slices each.");





    }
}
