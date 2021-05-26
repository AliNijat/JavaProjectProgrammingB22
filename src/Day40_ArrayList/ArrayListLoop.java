package Day40_ArrayList;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListLoop {
    public static void main(String[] args) {

        /**
         * ==>> Polymorphic way of declaring
         */

        List<Integer> nums = new ArrayList<>(); // polymorphic way of declaring

        System.out.println(nums);
        System.out.println("Size of nums = " + nums.size());

        nums.add(10);
        nums.add(100);
        nums.add(40);
        nums.add(70);
        nums.add(40);
        nums.add(180);
        nums.add(110);
        nums.add(140);
        nums.add(101);
        nums.add(107);
        nums.add(19);

        System.out.println("Nums = " + nums);

        nums.remove(1);
        System.out.println("Nums, removed '100' = " + nums);

        // nums.remove(40); -->> outOfIndex
        nums.remove(new Integer(40));
        System.out.println("Nums, removed first '40' = " + nums);

        //
        for (int i = 0; i < nums.size(); i++) {
            System.out.print( nums.get(i) + ", ");

        }
        for (int i = 0; i < nums.size(); i++) {
     //       System.out.println( nums.get(i) + ", " + nums.get(i) + ", ");

        }
    }
}
