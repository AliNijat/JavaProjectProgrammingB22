package Day58_Polymorphism;

public class Amazon extends OnlineShopping implements Prime{
    @Override
    public void buy() {
        System.out.println("Items are buying");
    }

    @Override
    public void sell() {
        System.out.println("Items are selling");
    }

    public void ship(){
        System.out.println("Shipping the purchased items");
    }

    @Override
    public void primeShipping() {
        System.out.println("Your items are eligible for free shipping");
    }
}
