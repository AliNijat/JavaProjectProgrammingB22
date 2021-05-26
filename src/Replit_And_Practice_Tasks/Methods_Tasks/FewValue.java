package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Arrays;

public class FewValue {
    public static void main(String[] args) {
        String rr [] = {"aa", "be", "lol", "lel", "oreo"};
        System.out.println(Arrays.toString(getWithE(rr)));
    }
    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------

        String rr [] = {"aa", "be", "lol", "lel", "oreo"};

        int countE = 0;
        for (int i = 0; i < rr.length; i++) {
            if (rr[i].contains("e")){
                countE++;
            }
        }
        System.out.println(countE);

        String fewValues [] = new  String[countE];

        for (int i = 0; i < rr.length; i++) {
            if (rr[i].contains("e")){
                fewValues[i] += i+1;
            }

        }

        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }



}
