package Day45_OOP;

public class CoffeeTest {
    public static void main(String[] args) {

        Coffee myCoffee = new Coffee();
        System.out.println("coffee amount = " + myCoffee.getAmount());
        myCoffee.refill();
        System.out.println("myCoffee after refill = " + myCoffee.getAmount());
        myCoffee.drink(20);
        System.out.println("myCoffee after drink 20 = " + myCoffee.getAmount());

        myCoffee.setType("Turkish coffee");
        System.out.println("myCoffee after select type = " + myCoffee.getType());

        System.out.println();
        System.out.println("myCoffee.toString() = " + myCoffee.toString());

        Coffee myCoffee1 = new Coffee();
        myCoffee1.setType("Cappuccino");
        Coffee myCoffee2 = myCoffee1;
        System.out.println("myCoffee1 type = " + myCoffee1.getType());
        myCoffee2.setType("Espresso");
        System.out.println("myCoffee2 type = " + myCoffee2.getType());

        Coffee myCoffee3 = new Coffee();
        myCoffee3.setType("Frappucino");
        System.out.println("myCoffee3 type = " + myCoffee3.getType());
    }
}
