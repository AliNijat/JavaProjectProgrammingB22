package Day15_IfStatement_Continue;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " +(true));
        System.out.println("!false = " + (!false));

        int age = 2;

        if (!(age > 7)){
            System.out.println("Need to use child car seat");
        }
    }
}
