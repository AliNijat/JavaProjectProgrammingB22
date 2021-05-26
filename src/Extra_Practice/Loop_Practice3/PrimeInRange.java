package Extra_Practice.Loop_Practice3;

public class PrimeInRange {
    public static void main(String[] args) {

        // this way work fine only for numbers more than 10 ...
        for (int i = 2; i <= 100; i++) {

            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0 || i == 2 || i == 3 || i == 5 || i == 7) {
                System.out.print(i);
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        // Second way is the complete and correct solution
        int number = 100;
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2 ){
                System.out.print(i);
                System.out.print(", ");
            }
        }

    }
}
