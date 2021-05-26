package Replit_And_Practice_Tasks.Methods_Tasks;

/*
Write a void method printUniqueNumbers that will print unique numbers from an array of ints.`

Example:

input:[2, 5, 5, 6, 3, 6, 9, 34, 3]

output:
2
9
34
 */
public class UniqueNumber {
    public static void main(String[] args) {


        int[] numbers = {2, 5, 5, 6, 3, 6, 9, 34, 3};

        int tep = 0;
        for (int n = 0; n < numbers.length; n++) {
            tep = 0;
            for (int j = 0; j < numbers.length; j++) {
                if (n != j) {
                    if (numbers[n] == numbers[j]) {
                       tep ++;
                    }
                }
            }
            if (tep == 0){
                System.out.println(numbers[n]);
            }
        }
    }
}
