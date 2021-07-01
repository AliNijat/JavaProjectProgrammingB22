package Replit_And_Practice_Tasks.Methods_Tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Method_ReturnDuplElementFromArr {


    public static int getDup(String []arr){

        String newArr [] = new String[arr.length];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            newArr[i]= arr[i];
            for (int j = 0; j < arr.length; j++) {

                System.out.println(Arrays.toString(newArr));
                if (newArr[i].equals(arr[i])) {
                    count++;
                    System.out.println(count);
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {

        String []arr = new String []{"1","2","aa","1", "aa"};
        System.out.println(getDup(arr));
    }
}
