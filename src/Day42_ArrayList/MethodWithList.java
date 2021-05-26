package Day42_ArrayList;

import java.util.*;

public class MethodWithList {
    public static void main(String[] args) {

        List<String> str = new ArrayList<>(Arrays.asList("Java", "is", "fun", "or", "Python", "is", "cool"));
        StringMethod(str);

        List<Integer> nums = Arrays.asList(10, 20, 40, 50, 100);
        System.out.println(sumInterList(nums));

    }
    public static void StringMethod(List<String> str) {
        List<String> newStr = new ArrayList<>();
        System.out.println(str);
    }

    public static int sumInterList(List<Integer> num){
        int sum = 0;
        for (int i = 0; i < num.size(); i++) {

            sum += num.get(i);
        }
        return sum;

    }
}
