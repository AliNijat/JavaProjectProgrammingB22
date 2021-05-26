package Day46_Encapsulation;

public class Dealership {

    public static void main(String[] args) {

        Car car1 = new Car();

      // they are private we can not use out of themself class
      //  car1.make = "Jeep wrangler";
      //  car1.year = 2021;

        car1.setMake("Jeep Wrangler");
        System.out.println("car1 make = " + car1.getMake());

        car1.setYear(2021);
        System.out.println("car1 Year = " + car1.getYear());

        car1.setMileage(137000);
        System.out.println("car1 Mileage = " + car1.getMileage());


        System.out.println("car1 to String = " + car1.toString());
        // System.out.println(car1); // atu
        System.out.println();

        Car alfaRomeo = new Car();
        alfaRomeo.setMake("Toyota");
        alfaRomeo.setYear(2017);
        alfaRomeo.setMileage(16604);

        System.out.println("alfaRomeo Make  = " + alfaRomeo.getMake());
        System.out.println("alfaRomeo Year  = " + alfaRomeo.getYear());
        System.out.println("alfaRomeo Mileage  = " + alfaRomeo.getMileage());

        System.out.println();
        System.out.println("alfaRomeo Description = " + alfaRomeo);


    }

}
