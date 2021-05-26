package Day16_Switch_Ternary;

import java.util.Scanner;

public class MyElevatorProgram {
    public static void main(String[] args) {

        // I'm trying to do some practice with ternary, if and switch all together
        Scanner scan = new Scanner(System.in);
        System.out.println("-------ELEVATOR--------");

        System.out.println("Please switch ^ or v");
        String direction = scan.next();

        direction = (direction.equals("^")) ? "going up" : "going down";
        System.out.println(direction);

        System.out.println("Please select the floor");
        int floorNum = scan.nextInt();

        if (floorNum > 0 && floorNum <= 3) {

            switch (floorNum) {
                case 1:
                    System.out.println("Floor " + floorNum + ", You arrived at floor" + floorNum);
                    break;
                case 2:
                    System.out.println("Floor " + floorNum + ", You arrived at floor" + floorNum);
                    break;
                case 3:
                    System.out.println("Floor " + floorNum + ", You arrived at floor" + floorNum);
                    break;
                default:
                    System.out.println("Invalid floor ");
            }
        }else {
            System.out.println("Invalid floor ");
        }
    }
}
