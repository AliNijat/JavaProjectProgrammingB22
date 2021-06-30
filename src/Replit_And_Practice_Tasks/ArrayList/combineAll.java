package Replit_And_Practice_Tasks.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class combineAll {

    public static void main(String[] args) {

        ArrayList<Integer> listOne = new ArrayList<>(Arrays.asList(20, 40, 50));
        ArrayList<Integer> listTwo = new ArrayList<>(Arrays.asList(60, 30, 70));
        System.out.println(combineAll(listOne, listTwo));
    }

    public static ArrayList<Integer> combineAll(ArrayList<Integer> listOne, ArrayList<Integer> listTwo){
        ArrayList<Integer> newList = new ArrayList<>(listOne.size() + listTwo.size());

        for (int i = 0; i < listOne.size(); i++) {
            newList.add(listOne.get(i));
            newList.add(listTwo.get(i));
        }

        Scanner n = new Scanner(System.in);
        System.out.println("Do you ascending or descending order?\nFor Ascending put 'a' and for descending put 'd'");
        String answer = n.nextLine();
        if (answer.contains("a")) {
            Collections.sort(newList);
        } else if (answer.contains("d")){
            //System.out.println(newList);
            Collections.sort(newList, Collections.reverseOrder());
        }else {
            newList = newList;
        }
        return newList;
    }
}
