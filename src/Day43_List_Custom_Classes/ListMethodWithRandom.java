package Day43_List_Custom_Classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListMethodWithRandom {

    public static void main(String[] args) {

        System.out.println(getRandomList(10));
        List<Integer> nums = getRandomList(101);
        System.out.println("nums = " + nums);
        System.out.println("nums.size() = " + nums.size());

        nums.removeIf(n -> n % 2 != 0);
        System.out.println("nums after remove If = " + nums);

    }

    public static List<Integer> getRandomList(int size) {
        List<Integer> nums = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < size - 1; i++) {

            nums.add(random.nextInt(100));
        }

        return nums;

    }
}