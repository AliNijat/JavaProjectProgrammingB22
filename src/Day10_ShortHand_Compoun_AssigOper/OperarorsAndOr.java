package Day10_ShortHand_Compoun_AssigOper;

public class OperarorsAndOr {
    public static void main(String[] args) {
        String model = "Jeep";
        boolean test = model.equals("Jeep") && model.equals("Benz"); // false
                 test = model.equals("Jeep") & model.equals("Benz"); // false
        System.out.println(test);

        int myAge = 31;
        int yourAge = 30;

        boolean ressult = myAge > yourAge || yourAge > myAge; // ture
                     ressult = myAge > yourAge | yourAge > myAge;
        System.out.println(ressult);
    }
}
