package Day18_Conditions_practice;

public class FBWithLoop {

        public static void main(String[] args) {
            int num;
            for (num = 1; num <= 100; num++) {
                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.print(" FizzBuzz ");
                } else if (num % 3 == 0) {
                    System.out.print(" Fizz ");
                } else if (num % 5 == 0) {
                    System.out.print(" Buzz ");
                } else {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }

}
