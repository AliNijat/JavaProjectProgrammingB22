package Day32_Arrays_Split;

import java.util.Arrays;

public class Split_StringClass {
    public static void main(String[] args) {

        String items = "Shoes;Jacket;Gloves;Airpods;Ipad;iphone 11 case";

        String result[] = items.split(";");
        System.out.println(Arrays.toString(result));

        String items1 = "Shoes Jacket Gloves Airpods Ipad";
        System.out.println(Arrays.toString(items1.split(" ")));

        String items2 = "java is fun but when I write code is cool";
        System.out.println(Arrays.toString(items2.split(" ")));
        System.out.println();
        System.out.println("-------So let know what is the array length-------");

        System.out.println("length of array items is = " + items.length());
        System.out.println("length of array items1 is = " + items1.length());
        System.out.println("length of array items2 is = " + items2.length());
        System.out.println();

        // // by loop
        for (String each : result) {
            System.out.print(each);
            System.out.print(", ");
        }
        System.out.println();

        // printing only some index in arrays
        String words = "java is fun but when I write code is cool";
        String word1[] = words.split(" ");
        System.out.println((word1[2])); // fun

        for (String each : word1) {
            System.out.println(each );
        }
    }
}
