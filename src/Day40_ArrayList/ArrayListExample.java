package Day40_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList <Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(7);
       // nums.add(123, 273); -->> ????
        // nums.add("java"); error, because it's a specific array
        nums.add(nums.size());

        System.out.println("size = " + nums.size());
        System.out.println("elements = " + nums);

        // get() -->> in ArrayList we have get to access in the index
        System.out.println("At index 2 = " + nums.get(2));
        System.out.println("At index 0 = " + nums.get(0));
        System.out.println("At index 1 = " + nums.get(1));

        // remove() -->> for removing some element in ArrayList
        nums.remove(2);
        System.out.println(nums);

    }
}
