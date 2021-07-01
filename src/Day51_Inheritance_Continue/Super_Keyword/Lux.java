package Day51_Inheritance_Continue.Super_Keyword;

public class Lux extends Lyft{

    @Override
    public double CalculateRate(double miles){
        return super.CalculateRate(miles) * 1.2;
    }
}
