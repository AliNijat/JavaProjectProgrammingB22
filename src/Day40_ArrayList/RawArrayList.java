package Day40_ArrayList;


import java.util.*;

public class RawArrayList {
    public static void main(String[] args) {

        /**
         * Declaring Array list in 2 way
         * 1-     ArrayList list = new ArrayList();
         * 2-     List list2 = new ArrayList();
         */

        ArrayList list1 = new ArrayList();
        List list2 = new ArrayList();

        System.out.println("Default value = " + list1 + " " +list2);

        // add value
        list1.add("java");
        list2.add(2323);
        list1.add(false);
        list1.add(true);
        list2.add("wooden spoon");

        // print value
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

        // size
        System.out.println("Size = " + list1.size());
        System.out.println("Size = " + list2.size());
    }
}
