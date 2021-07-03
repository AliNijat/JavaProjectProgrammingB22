package Day58_Polymorphism;

public abstract class OnlineShopping {

    public abstract void buy();
    public abstract void sell();
    public void ship(){
        System.out.println("Shipping the purchased items");
    }

}
