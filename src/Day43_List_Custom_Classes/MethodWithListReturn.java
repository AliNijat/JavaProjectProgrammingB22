package Day43_List_Custom_Classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodWithListReturn {
    public static void main(String[] args) {


        List<Integer> nums = getIntegerList();
        System.out.println("ArrayList = " + nums);

        long start = System.nanoTime();
        System.out.println("Array = " + Arrays.toString(getIntegerArray()));
        long end = System.nanoTime();
        System.out.println("Array time = " + (end - start ));

    }

    public static List<Integer> getIntegerList(List<Integer> nums) {

        for (int i = 0; i <= 1000_000; i++) {
            nums.add(i);
        }
        return nums;
    }

    public static List<Integer> getIntegerList() {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i <= 1000000; i++) {
            nums.add(i);
        }
        return nums;
    }

    public static int[] getIntegerArray() {
        int[] nums = new int[10000001];
        for (int i = 0; i <= 1000000; i++) {
            nums[i] = i;
        }
        return nums;
    }
}
