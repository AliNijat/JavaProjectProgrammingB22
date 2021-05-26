package Extra_Practice.Arrays_Practice1;

public class Average {
    public static void main(String[] args) {
        int[] numbers = {10, 40, 50, 20, 2, 15, 1, 500};

        int totalNums = 0;
        int average = 0;

        for ( int eachArray : numbers ) {
            totalNums += eachArray;

        }
        average = totalNums / numbers.length;
        System.out.println(average);


    }
}
