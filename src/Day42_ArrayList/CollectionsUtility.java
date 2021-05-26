package Day42_ArrayList;

import java.util.*;
public class CollectionsUtility {
    public static void main(String[] args) {

        ArrayList<String> letters = new ArrayList<>();
        letters.addAll(Arrays.asList("Ali", "jan", "nijat", "Mohammad", "Ali"));

        System.out.println(letters);
        System.out.println("size = " + letters.size());

        Collections.reverse(letters);

       // System.out.println(Collections.reverse(letters)); // revers method is void we can't use in print
        System.out.println(Collections.frequency(letters, 'A'));

        System.out.println("Reversed = " + letters);

        Collections.frequency(letters, "Ali");
        System.out.println("Count of Ali = " + Collections.frequency(letters, "Ali"));

        Collections.replaceAll(letters, "Ali", "java");
        Collections.replaceAll(letters, "Mohammad", "fun");
        System.out.println("After replaced all = " + letters);

        Collections.reverse(letters);
        System.out.println("Again reversed = " + letters);

        Collections.sort(letters);
        System.out.println("Sorted = " + letters);

        System.out.println();


        List<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(12, 44, 44, 66, 77, 88, 99, 100, 20, 20, 10));

        int countOf20 = Collections.frequency(nums, 20);
        System.out.println("Count of 20 = "+ countOf20);

        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));

        Collections.sort(nums);
        System.out.println(nums);

        Collections.shuffle(nums);
        System.out.println(nums);


    }
}
