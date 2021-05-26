package Day12_Conditional_Statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 45;
        int speedLimit = 35;

        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < currentSpeed);
        System.out.println(currentSpeed == speedLimit);

        boolean isSpeedy = currentSpeed > speedLimit;
        System.out.println("Are you speeding? - " + isSpeedy );

        System.out.println("My current speed: - " + currentSpeed);
        System.out.println("The limit speed: - " + speedLimit);

        System.out.println("-----------------------------------------");

        currentSpeed += 20;
        isSpeedy = currentSpeed > speedLimit;

        System.out.println("Am I driving over speed? - " + isSpeedy);
        System.out.println("Cause your current speed is: " + currentSpeed + " MPH");
        System.out.println("And the limit speed is: " + speedLimit + " MPH");

        System.out.println("--------------------------------------------");

        double currentBalance = 340.60;
        double itemPrice = 350.99;

        itemPrice -= 20;

        boolean canIPourches = currentBalance >= itemPrice;

        System.out.println("Can I pourches this item? - " + canIPourches);
        System.out.println("Can I Pourches this item with discount?  " + canIPourches);

        currentBalance -=350;

        boolean isBroke = currentBalance >= itemPrice;
        System.out.println("Invalid entery please see cashier - " + isBroke);
    }
}
