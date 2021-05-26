package Day31_Arrays_Practice;
import java.util.Arrays;
import java.util.Collections;
public class ArraysUtil {
    public static void main(String[] args) {

        double [] nums = {100.99, 3430, 500, 500.40, 200.10, 100,400, 300 };

        // converting to string from an arrays
        String num3 = Arrays.toString(nums);
        System.out.println("List of nums in original format = " + num3);

        // sort/ in order
        Arrays.sort(nums);
        System.out.println("List of nums after sorting or ordering = " + Arrays.toString(nums));
        System.out.println("_______________________________________________________________________");


        // another example
        String [] word = {"java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};

        System.out.println(Arrays.toString(word));
        System.out.println("[" + String.join(", ", word) + "]");
        System.out.println("_______________________________________________________________________");

        // sort word in alphabetic and ASCII order
        Arrays.sort(word);
        System.out.println(Arrays.toString(word));
        System.out.println("_______________________________________________________________________");


        // sort in reverse
        Arrays.sort(word, Collections.reverseOrder());
        System.out.println(Arrays.toString(word));
        System.out.println("_______________________________________________________________________");

        // for searching some element or object
        // but it work only after sorted arrays
        System.out.println(Arrays.binarySearch(nums, 500));
        // if array was string data or non primitive,
        System.out.println(Arrays.binarySearch(word, "java")); // ???
        System.out.println("_______________________________________________________________________");

        // equals.method
        double [] num1 = {100.99, 3430, 500, 500.40, 200.10, 100,400, 300 };
        double [] num2 = {100.99, 3430, 500, 500.40, 200.10, 100,400, 300 };

        double [] num4 = {100.99, 3430, 500, 500.30, 200.10, 100,400, 300 };
        double [] num5 = {100.99, 600, 500, 500.40, 200.10, 100,400, 300 };


        System.out.println(Arrays.equals(num1, num2)); // num1 to num2 --> true
        System.out.println(Arrays.equals(num4, num5)); // num4 to num5 --> false
        System.out.println(Arrays.equals(num1, num5)); // num1 to num5 --> false
        System.out.println(Arrays.equals(num2, num5)); // num2 to num5 --> false

        System.out.println("_______________________________________________________________________");

        if (num1 == num2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        if (Arrays.equals(num1, num2)){
            System.out.println("Matching");

        }else {
            System.out.println("Don't matching");
        }

        String[] cars1 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars2 = {"Toyota","Honda", "Tesla","BMW", "Dodge"};
        String[] cars3 = {"toyota","honda", "tesla","bmw", "dodge"};
        String[] cars4 = {"Toyota","Honda", "Tesla"};


        if (cars1 == cars2) {
            System.out.println("cars1 == cars2");
        }else {
            System.out.println("cars1 != cars2");
        }
        if (Arrays.equals(cars1, cars2)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        if (Arrays.toString(cars3).equalsIgnoreCase(Arrays.toString(cars4))){
            System.out.println("cars3 == cars4");

        }else {
            System.out.println("cars3 != cars4");
        }
    }
}
