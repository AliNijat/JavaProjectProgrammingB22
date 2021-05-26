package Replit_And_Practice_Tasks.Scanner_Practice;
import java.util.*;

public class SeniorCitizensOrNot {

        public static void main(String[] args) {
            //WRITE YOUR CODE HERE

            Scanner scan = new Scanner (System.in);

            System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
            int seniorCitizens = scan.nextInt();
            int nonSeniorCitizens = scan.nextInt();

            System.out.println("What is new citizen's age?");
            int age =scan.nextInt();

            if (age >= 65){

                System.out.println("Senior Citizen");
                seniorCitizens+=1;

            }else if (age < 65){
                System.out.println("Non-Senior Citizen");
                nonSeniorCitizens+=1;
            }
            System.out.println("New seniorCitizens count " + seniorCitizens);
            System.out.print("New nonSeniorCitizens count "+ nonSeniorCitizens);



    }

}
