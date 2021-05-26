package Day13_Conditional_Statements;

public class IsAffordable {
    public static void main(String[] args) {

        double price = 240.50;
        boolean isAffordable = price <= 200;

        System.out.println("Is affordable = " + isAffordable);
        if (isAffordable){
            System.out.println("I can affordable it, lets buy!");
        }else {
            System.out.println("Too expensive, lets keep coding java");
        }
        System.out.println("----------------------------");

        boolean isRemoteJob = true;

        if (!isAffordable){
            System.out.println("Sorry, I am not interested");
        }else {
            System.out.println("Perfect, I am interested, what is the interview process?");
        }

    }
}
