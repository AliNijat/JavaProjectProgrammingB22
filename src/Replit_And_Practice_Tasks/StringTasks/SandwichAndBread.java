package Replit_And_Practice_Tasks.StringTasks;

import java.util.Scanner;

/*
A sandwich is two pieces of bread with something in between. Print the string that is between the first and last appearance of "bread" in the given string, or return string "nothing" if there are not two pieces of bread.

Example:

input: breadjambread

output: jam
input: breadjambread

output: jam
input: xxbreadjambreadyy

output: jam
input: xxbreadjambreadyy

output: jam
input: xxbreadapple

output: nothing
input: xxbreadapple

output: nothing
input: breadbutterbread

output: butter
 */
public class SandwichAndBread {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        if (str.contains("bread") || str.contains("Bread") || str.contains("BREAD")) {

            int firstIndex = str.indexOf("bread");
            int lastIndex = str.lastIndexOf("bread");

            if (firstIndex == lastIndex) {
                System.out.println("nothing");
            } else {

                System.out.println(str.substring(firstIndex + 5, lastIndex));
            }

        } else {
            System.out.println("nothing");
        }


//        String firstBread = str.substring(0, 5);
//        System.out.println(firstBread); // bread
//        String nonBread = str.substring(firstBread.length());
//        System.out.println(nonBread); // the rest of string


    }
}
