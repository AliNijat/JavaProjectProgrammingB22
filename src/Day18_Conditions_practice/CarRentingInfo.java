package Day18_Conditions_practice;

public class CarRentingInfo {
    public static void main(String[] args) {

        String make = "";
        String model = "";

        int rentRange = 0;

        if (model.equals("Jeep") && make.equals("2018")){
            rentRange = 530;
        }else if (model.equals("Jeep") && make.equals("2020")){
            rentRange = 540;
            System.out.println();
        }

    }
}
