package Day51_Inheritance_Continue.Super_Keyword;

public class LyftRide {

    public static void main(String[] args) {


        Lyft lyft = new Lyft();
        Lux lux = new Lux();
        LyftXL lyftXL = new LyftXL();

        System.out.println(lyft.CalculateRate(5));
        System.out.println(lux.CalculateRate(5));
        System.out.println(lyftXL.CalculateRate(5));
    }
}
