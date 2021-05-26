package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Arrays;
/*
Finish the getWithE. Given a String array arr with the following elements

["zero", "one", "two","three","four"]

Create another array fewValues and copy words that have letter e in them

You need to know how many element contain e and create array accordingly

Values in fewValues array need to be ["zero", "one","three"]

Examples:

arr -> ["aa", "be", "lol", "lel", "oreo"]

fewValues -> ["be",  "lel", "oreo"]
arr -> ["aa", "be", "lol", "lel", "oreo"]

fewValues -> ["be",  "lel", "oreo"]
arr -> ["e", "hey", "bye", "fury", "spoon"]

fewValues ->["e", "hey", "bye"]
 */
public class CopyCertaineValue {
    public static void main(String[] args) {

        String arr[] = {"aa", "be", "lol", "lel", "oreo"};

        System.out.println(getValue(arr));
    }
    public static String [] getValue(String [] arr){
        String tep = "";

        for (int each = 0; each < arr.length; each++) {
            if (arr[each].contains("e")) {
                tep += arr[each] + " ";
            }
        }
        String fewValue [] = tep.split(" ");
      //  System.out.println(tep);
       // System.out.println(Arrays.toString(fewValue));
        return fewValue;
    }
}
