package Office_Hours.Practice_06_22_21;

public class Ebay extends OnlineShopping {

    @Override
    public void viewCart() {

    }

    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {

    }

    @Override
    public void returnItem() {

    }
}
