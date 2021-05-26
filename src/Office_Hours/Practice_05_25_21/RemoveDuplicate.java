package Office_Hours.Practice_05_25_21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicate {
    public static void main(String[] args) {

        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(20, 30, 40, 20, 10, 30, 90));
        System.out.println(removeDup(arr));
        System.out.println(removeDup2(arr));

    }

    public static ArrayList <Integer> removeDup(ArrayList<Integer> list){
        ArrayList<Integer> uniques = new ArrayList<>();
        String checked = "";

        for (int i = 0; i < list.size(); i++) {
            int count = 0;

            if (!checked.contains(""+list.get(i))) {

                for (int j = 0; j < list.size(); j++) {
                    if (list.get(i) == list.get(j)) {
                        count++;
                    }
                }
                if (count == 1) {
                    uniques.add(list.get(i));
                }
                checked += list.get(i) + " ";
            }
        }
        return uniques;
    }

    public static ArrayList<Integer> removeDup2 (ArrayList<Integer> list){
        list.removeIf(e -> Collections.frequency(list, e) > 1);
        return list;

        // i added this to hi
        // I new commit
    }
}
