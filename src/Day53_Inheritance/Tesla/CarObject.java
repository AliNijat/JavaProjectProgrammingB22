package Day53_Inheritance.Tesla;

public class CarObject {

    public static void main(String[] args) {

        ElectricCar car1 = new ElectricCar("Tesla", "Medel Y", 28010.50, 2021, 326);
        car1.drive(20);
        System.out.println(car1);
        System.out.println("Car1 make = " + car1.getMake());
        System.out.println("Car1 model = " + car1.getModel());
        System.out.println("Car1 price = $" + car1.getPrice());
        System.out.println("Car1 year = " + car1.getYear());
        System.out.println("Car1 range = " + car1.getRange());

        if (car1.getPrice() > 30000){
            System.out.println(car1.getMake() + " - " + car1.getModel() + " is out of my budget");
        }else {
            System.out.println("Purchasing " + car1);
        }

        System.out.println("Count = " + car1.getCount());

        System.out.println();

        ElectricCar car2 = new ElectricCar("Tesla", "CyberTruck", 1000794.874, 2022, 300);
        System.out.println(car2);
        System.out.println("Count = " + car2.getCount());

        System.out.println();

        Roadster roadster = new Roadster();
        roadster.drive(1000);
        System.out.println(roadster);
        System.out.println("Count = " + roadster.getCount());

    }
}
