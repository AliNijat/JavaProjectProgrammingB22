package Day09_Scanner_Practice1;

public class RemainderOperator {
    public static void main(String[] args) {

        System.out.println(10 / 3); // 3
        System.out.println(10 % 3); // 1 remained after division

        System.out.println(10 / 5); // 2
        System.out.println(10 % 5); // 0 remained after division

        System.out.println(20 / 7); // 2
        System.out.println(20 % 7); // 6 remained after division

        //Example: The 123 cents how much can be?
        // 1 dollar == 100 and remainder == 23 cents
        int cents = 123;
        int dollar = cents /100;
        int remainder = cents % 100;
        System.out.println("In " +cents + " cents are: $" + dollar);
        System.out.println("And " + remainder + " cents are remaining");




    }
}
