package Replit_And_Practice_Tasks;
/*
Write a switch statement that tests the value of the char variable response and performs the following actions:

if response is y, print: "Write a switch statement that tests the value of the char variable response and performs the following actions:

if response is y, print: "Your request is being processed is printed"
if response is n, print: "Thank you anyway for your consideration is printed"
if response is h, print: "Sorry, no help is currently available is printed"
for any other value of response, print: "Invalid entry, please try again!"
Example:

Display prompt: Enter command:
input: y
Display prompt: Your request is being processed"
if response is n, print: "Thank you anyway for your consideration is printed"
if response is h, print: "Sorry, no help is currently available is printed"
for any other value of response, print: "Invalid entry, please try again!"
Example:

Display prompt: Enter command:
input: y
Display prompt: Your request is being processed
 */
import java.util.Scanner;

public class TestValueOfChar {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter command:");
        char response = scan.next().charAt(0);
        //WRITE YOUR CODE HERE
int value = 0;
        switch (response){
            case 'y':
                value = response;
                System.out.println("Your request is being processed is printed, And we got: " + value);
                break;
            case 'n':
                value = response;
                System.out.println("Thank you anyway for your consideration is printed, but we got: " + value);
                break;
            case 'h':
                value = response;
                System.out.println("Sorry, no help is currently available is printed, Also we got: "+ value);
                break;
            default:
                value = response;
                System.out.println("Invalid entry, please try again!, Are looking for: "+ value);
        }



    }
}
