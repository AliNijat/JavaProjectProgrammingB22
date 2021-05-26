package Day16_Switch_Ternary;

import java.util.Scanner;

/**
 * add new class Elevator
 * <p>
 * declare variable floorNum = 1
 * Multi branch if:
 * when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
 * <p>
 * when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
 * <p>
 * when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
 * <p>
 * anything else: print "Invalid floor - 6"
 */
public class Elevator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the floor number");
        int floorNum = scan.nextInt();

        switch (floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            default:
                System.out.println("Invalid floor - 6");
        }
        System.out.println("_____________Whith if statement____________");

        if (floorNum == 1) {

            System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
        } else {
            System.out.println("Invalid floor - 6");
        }

        System.out.println("-------ELEVATOR--------");
        System.out.println("Please select the floor");
        String direction = scan.nextLine();
        if (direction == "Up"){
            System.out.println("Going up");
        } else if (direction == "Down"){
            System.out.println("Going down!");
        }
        switch (floorNum){
            case 1:
                System.out.println("Floor " + floorNum + " You arrived at " + floorNum);
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house");
            default:
                System.out.println("Invalid floor - 6");
        }

    }
}
