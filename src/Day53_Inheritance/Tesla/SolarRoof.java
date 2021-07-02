package Day53_Inheritance.Tesla;

public class SolarRoof extends ElectricCar{


    public SolarRoof( double price, int year, int range) {
        super("Tesla", "Solar Roof", price, year, range);
    }
// TODO >> ERROR: Below because charge is final method it cannot be overridden
//    public void charge(){
//
//    }
}
