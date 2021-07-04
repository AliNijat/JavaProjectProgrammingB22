package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Arrays;

public class getDuplicate {
    public static void main(String[] args) {
        String r1[] = {"o", "4", "o", "t", "4", "t"};
        String r2[] = new String[r1.length];

        int count = 0;
        int totalDup = 0;
        for (int i = 0; i < r1.length; i++) {
            r2[i] = r1[i];
            count = 0;
            for (int j = 0; j < r1.length; j++) {
                if (r1[i].equals(r1[j])){
                    count ++;
                }
            }
            totalDup += count;

        }
        System.out.println(totalDup + ",  "+count);
        System.out.println(Arrays.toString(r2));


    }
}
