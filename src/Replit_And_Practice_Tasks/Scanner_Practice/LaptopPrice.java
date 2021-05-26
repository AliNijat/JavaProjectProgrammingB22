package Replit_And_Practice_Tasks.Scanner_Practice;
import java.util.*;

public class LaptopPrice {

        public static void main(String[] args) {

            Scanner scan = new Scanner (System.in);

            System.out.println("Select screen size:");
            double screenSize = scan.nextDouble();
            double price = 0;

            System.out.println("Select CPU type:");
            String CPU = scan.next();

            System.out.println("Select RAM size:");
            String RAM = scan.next();

            System.out.println("Select storage type:");
            String Storage= scan.next();

            System.out.println("Enter memory size:");
            String Memory = scan.next();

            System.out.println("Enter screen resolution:");
            String Resolution = scan.next();

            if (screenSize == 13.3 ){
                price += 200;
            }else if (screenSize == 15){
                price +=300;
            }else if(screenSize == 17.3){
                price += 400;

            }else if (CPU.equals("i3")){
                price += 150;
            }else if (CPU.equals("i5")){
                price += 250;
            }else if (CPU.equals("i7")){
                price += 350;
            }else if (RAM.equals("4BG")){
                price +=50;

            }else if (Storage.equals("HDD")){
                price +=50;
            }else if (Storage.equals("HDD")) {
                price += 100;
            }else if (Memory.equals("1000")){
                price +=0;

            }else if (Resolution.equals("FULLHD")){
                price +=100;
            }else if (Resolution.equals("4K")){
                price += 200;
            }else{

            }



            System.out.println("Laptop price is: $" + price);
        }

}
