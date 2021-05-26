package Extra_Practice.Loop_Practice1;

public class OddNumsBy3and5 {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                 System.out.print(i + " odd ");
                }
            }

            if (i % 2 == 0 ){
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i + " even ");

                }

            }
        }
        System.out.println();
    }
}