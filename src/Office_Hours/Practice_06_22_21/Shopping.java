package Office_Hours.Practice_06_22_21;

/*
Shopping

Create an abstract class Shopping
    - Declare two abstract methods:
        buyItem(), returnItem()





Create a concrete class Amazon
    - Inherit OnlineShopping and implement all abstract methods

Create a concrete class Ebay
    - Inherit OnlineShopping and implement all abstract methods

Create an interface AllowUsersToSell
    - Declare an abstract method:
        uploadProduect()
 */
public  abstract class Shopping {

    public abstract void buyItem();

    public abstract void returnItem();
}
