package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Scanner;

/*
The method person has a string arguement with this format:
"name,last name,age". Print out the person's information

Example:

person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30
person("jon,doe,30");

output:
person name: jon
last name: doe
age: 30
hint: use the split method to split the string to a string array where there is a "," char
 */
public class SplitPersonInfo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s);
    }

    public static void person(String info) {
        //your code here
        String arr[] = info.split(", ");
        System.out.println("person name: " + arr[0] + "\nlast name: " + arr[1] + "\nage: " + arr[2]);

    }
}
