package Quizess;

import java.util.Arrays;

public class ArraysShortQuiz {
    public static void main(String[] args) {
        int n = 0;
        String[] items = {"sun", "mon", "wed", "sat"};
//        Arrays.sort(items);
//        System.out.println(Arrays.toString(items));

        for (int i = 0; i < items.length; i++) {
            switch (items[i]){
                case "sat":
                case "sun":
                    n -=1;
                    break;
                case "mon":
                    n++;
                case "wed":
                    n +=2;
            }
        }
        System.out.println(n);
    }
}
