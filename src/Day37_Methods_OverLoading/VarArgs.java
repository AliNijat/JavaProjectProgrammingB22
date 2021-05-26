package Day37_Methods_OverLoading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(5, 6, 7, 8, 10, 20);
        addNumbers(3+4, 10-5, 3+10-2*2, 10%2*5/1, 10);

    }
    public static void addNumbers (int ... nums){

        int sumOf = 0;
        for (int i = 0; i < nums.length; i++) {
            sumOf += nums[i];

        }
        System.out.println(sumOf);
    }
}
