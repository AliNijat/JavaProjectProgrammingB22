package Day42_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 5, 6, 7, 6, 5, 4, 9));
        uniqueInteger1(nums);

        System.out.println("___________for i loop__________");

        List<Integer> nums1 = new ArrayList<>(Arrays.asList(0, 4, 10, 6, 7, 6, 5, 4, 9));
        List<Integer> unique1 = uniqueInteger(nums1);
        System.out.println(unique1);

    }

    public static void uniqueInteger1(List<Integer> nums) {
        List<Integer> unique = new ArrayList<>();

        for (Integer each : nums) {
            if (Collections.frequency(nums, each) == 1) {
                //  System.out.print(each + " ");
                unique.add(each);
            }
        }
        System.out.println(unique);
    }

    private static List<Integer> uniqueInteger(List<Integer> nums1) {
        List<Integer> unique1 = new ArrayList<>();

        for (int i = 0; i < nums1.size(); i++) {
            if (Collections.frequency(nums1, nums1.get(i)) == 1) {
                //  System.out.print(nums.get(i) + " ");
                unique1.add(nums1.get(i));
            }
        }
        return unique1;
    }
}
