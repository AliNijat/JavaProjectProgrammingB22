package Day45_OOP;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(20);
        System.out.println("amount after drink 20% = " + myCoffee.getAmount());

        myCoffee.setType("Turkish coffee");
        System.out.println("myCoffee after select type = " + myCoffee.getType());

        System.out.println();
        System.out.println("myCoffee.toString() = " + myCoffee);

        Coffee myCoffee1 = new Coffee();
        myCoffee1.setType("Cappuccino");
        Coffee myCoffee2 = myCoffee1;
        System.out.println("my new Coffee type1 = " + myCoffee1.getType());
        myCoffee2.setType("Espresso");
        System.out.println("my new Coffee type2 = " + myCoffee2.getType());

        Coffee myCoffee3 = new Coffee();
        myCoffee3.setType("Frappucino");
        System.out.println("my new Coffee type3 = " + myCoffee3.getType());

       // Coffee coffee4 = null; // NullPointerException
        //coffee4.setType("Turkish");
    }
}
