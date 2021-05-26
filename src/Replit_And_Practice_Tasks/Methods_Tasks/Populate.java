package Replit_And_Practice_Tasks.Methods_Tasks;

import java.util.Arrays;

public class Populate {
    public static void main(String[] args) {
        int [] i= new int[3];
        i = populate(i) ;
        System.out.println(Arrays.toString(i));
    }
    public static int[] populate(int[] r) {

        int [] tep = new  int[r.length];
        for (int i = 0; i < r.length; i++) {
            tep[i] = i+1;

        }
        return  tep;

    }
}
