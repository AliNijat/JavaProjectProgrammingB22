package Office_Hours.Practice_06_14_21;

public class CandyFactory {

    public static void main(String[] args) {

        Candy candy = new Candy("Nebot", -1000, true);
        System.out.println("Object of candy = " + candy);

        Take5 barOne = new Take5(4, true);
        System.out.println("Object of Take5 = " + barOne);

        Twix twix = new Twix(3, false);
        System.out.println("Object of twix = " + twix);

        System.out.println(Candy.getTotalNumOfCandies());

    }
}
