package Day29_NestedLoop_Arrays;

public class ArraysIntro {
    public static void main(String[] args) {

        int num = 0; // single and simple variable

        // Arrays variable
        int [] nums = new  int [3];
        nums [0] = 5;
        nums [1] = 10;
        nums [2] = 7;

        System.out.println("Variable at index 0 = " + nums [0]);
        System.out.println("Variable at index 1 = " + nums [1]);
        System.out.println("Variable at index 2 = " + nums [2]);

        // the bellow line is out of size or bound
        // nums [3] = 100;
        //System.out.println("Variable at index 3 = " + nums [3]);

        // we can also use int variable to specify index number
        int i = 0;
        System.out.println(nums[i]);
        i ++;
        System.out.println(nums[i]);


        // so now we want to about length of array elements both don't use () in arrays
        System.out.println(nums.length);
        int len = nums.length;
        System.out.println(len);

        System.out.println("____________After changing the data and reassigning__________________");
        nums [1] = 500;
        nums [0] = 100;
        nums [2] = 700;

        System.out.println("At index 0 = " + nums[0]);
        System.out.println("At index 1 = " + nums[1]);
        System.out.println("At index 2 = " + nums[2]);


        // 2. example
        int nums2 [] = {121, 464, 100, 500, 5468, 54700, 1000};
        System.out.println(nums2.length);
        System.out.println( "Index 0 = " +nums2[0] + " Index 1 = " + nums2 [1]+ " Index 2 = " + nums2[3] + " Index 3 = " +
                nums2[3] + " Index 4 = " + nums2[4] + " Index 5 = " + nums2[5] + " Index 6 = " + nums2[6] );


    }
}
