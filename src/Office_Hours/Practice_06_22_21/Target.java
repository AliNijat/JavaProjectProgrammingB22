package Office_Hours.Practice_06_22_21;

//    Create a concrete class Target
//    - Inherit Shopping and implement all abstract methods
public class Target extends Shopping{

    @Override
    public void buyItem() {
        System.out.println("Buying item from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Target");
    }
}
