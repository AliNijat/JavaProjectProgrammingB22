package Extra_Practice.Loop_Practice1;

public class EvenNumsAndSumOfit {
    public static void main(String[] args) {

        int sumOfEven = 0;
        int sumOfOdd = 0;

        for (int i = 1; i <= 100 ; i++) {
            if (i % 2 == 0){
                sumOfEven += i;
            }else if (i % 2 != 0){
                sumOfOdd += i;
            }
        }
        System.out.print("Sum of even numbers = " + sumOfEven);
        System.out.print("\nSum of odd numbers = " + sumOfOdd);
        System.out.println();
    }
}
