package Day13_Conditional_Statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Fairfax";

        if (city == "Fairfax"){
        // if (city.equals("Fairfax")){
            System.out.println("It is State");
        }else {
            System.out.println("It is village");
        }
        String weather = "sunny";
        if (!weather.equals("sunny")){
            System.out.println("Lets go out for walking");
        }else {
            System.out.println("Stay at home and ");
        }
    }
}
