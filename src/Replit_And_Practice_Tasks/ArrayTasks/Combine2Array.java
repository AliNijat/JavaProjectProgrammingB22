package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combine2Array {
    public static void main(String[] args) {

        String r1[] = {"f", "4", "o", "o"};
        String r2[] = {"b", "a", "r", "5"};
        System.out.println(combineRs(r1, r2));
    }
        public static List<String > combineRs(String []r1, String [] r2){

            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < (r1.length); i++) {
                list.add(r1[i]);

            }
            for (int i = 0; i < (r2.length); i++) {
                list.add(r2[i]);

            }

            return list;
        }

}
