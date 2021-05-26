package Replit_And_Practice_Tasks;

import java.util.Scanner;

/*
Write a program that will print a week days according to the day number.
Use Switch statement. If an invalid day is entered print: "Not a valid day"

Example

Enter number:
1

Output: Monday
Enter number:
1

Output: Monday
Enter number:
7

Output: Sunday
 */
public class WeekDays {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");

        int dayNumber = input.nextInt();

        switch (dayNumber){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid day");
        }

    }
}
