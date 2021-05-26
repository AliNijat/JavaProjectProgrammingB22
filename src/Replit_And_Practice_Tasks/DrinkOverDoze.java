package Replit_And_Practice_Tasks;
import java.util.Scanner;
public class DrinkOverDoze {
    public static void main(String[] args) {

                //WRITE YOUR CODE HERE:
                Scanner input = new Scanner (System.in);

                System.out.println("Enter number of milligrams in drink:");
                int numOfMilligm = input.nextInt();
                int drink = 10*1000 / numOfMilligm;

                System.out.println("It would take about " + drink + " drinks for a lethal overdose.");




            }
}
