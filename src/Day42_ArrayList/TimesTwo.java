package Day42_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Create a method that:

- is called `timesTwo`
- returns an `ArrayList` of Integers
- takes in a single parameter - an `ArrayList` of `Integers` called `nums`

This method should take the ArrayList parameter and multiply every value by two.
 */
public class TimesTwo {
    public static void main(String[] args) {

        List <Integer> numbers = new ArrayList<>(Arrays.asList(20, 10, 40, 50));
        System.out.println(timesTwo(numbers));
    }

    public static List<Integer> timesTwo(List<Integer> nums) {
        List<Integer> newNums = new ArrayList<>();
        for (int i = 0; i < nums.size(); i++) {
            newNums.add(nums.get(i)*2);
        }
        return newNums;
    }
}
