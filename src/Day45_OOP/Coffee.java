package Day45_OOP;

public class Coffee {

    double amount;
    String type;


    public void refill(){
        amount = 100;
    }

    public void drink(double someAmount){
        if (someAmount < amount) {
            amount -= someAmount;
        }else {
            System.out.println("invalid amount");
        }
    }

    public double getAmount(){
        return amount;
    }

    public void setType(String newType){
        type = newType;
    }
    public String getType(){
        return type;
    }


    @Override
    public String toString() {
        return "Coffee: " +
                "amount = " + amount + "%"+
                ", type = '" + type + '\'' +
                '}';
    }
}
