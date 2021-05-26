package Replit_And_Practice_Tasks.Scanner_Practice;
import java.util.Scanner;
public class SchoolGrade {
    public static void main(String[] args) {


                // Enter your code here

                Scanner scan = new Scanner (System.in);
                System.out.println("Welcome to the Grader!");

                System.out.println("Please enter subject name number 1 and score for this subject");
                String subjectName = scan.next();
                double score1 = scan.nextDouble();

                System.out.println("Please enter subject name number 2 and score for this subject");
                String biology = scan.next();
                double score2 = scan.nextDouble();

                System.out.println("Please enter subject name number 3 and score for this subject");
                String english = scan.next();
                double score3 = scan.nextDouble();

                System.out.println("Please enter subject name number 4 and score for this subject");
                String chemistry = scan.next();
                double score4 = scan.nextDouble();

                System.out.println("Please enter subject name number 5 and score for this subject");
                String music = scan.next();
                double score5 = scan.nextDouble();

                String summary = subjectName + " - " + score1 +", "+ biology + " - " + score2+", " + english + " - " + score3 +", "+ chemistry + " - " + score4 +", " + music +" - "+score5;
                double scoreAverage = (score1 + score2 + score3 + score4 + score5)/ 5;

                System.out.println("Summary: " + summary );
                System.out.println("Your average score is: " + scoreAverage);

                System.out.println("Thank you for using Grader!");
                System.out.println("Goodbye!");


            }
        }
