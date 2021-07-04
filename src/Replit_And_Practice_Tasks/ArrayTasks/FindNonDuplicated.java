package Replit_And_Practice_Tasks.ArrayTasks;

public class FindNonDuplicated {
    public static void main(String[] args) {

        int[] nums = {3, 6, 1, 3, 4, 6, 2, 4, 2, 9, 9};

        int nonDuplicate = 0;

        for (int i = 0; i < nums.length; i++) {
            nonDuplicate = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != nums[i]) {
                    nonDuplicate = nums[i];
                }
            }

        }
        System.out.println(nonDuplicate);
    }
}
