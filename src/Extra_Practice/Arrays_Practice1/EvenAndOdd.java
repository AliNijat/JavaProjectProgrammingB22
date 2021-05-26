package Extra_Practice.Arrays_Practice1;

public class EvenAndOdd {
    public static void main(String[] args) {

        int[] numbers = {10, 40, 50, 20, 2, 15, 1, 500};

        int even = 0;
        int odd = 0;

        for ( int each = 0; even <= numbers.length-1; each ++ ) {
            if (each % 2 == 0){
                even = each;
            } else {
           // if (each % 2 == 1){
                odd = each;
            }
//            System.out.println(even + ", ");
//            System.out.println(odd + ", ");
        }
        System.out.println(even + ", ");
        System.out.println(odd + ", ");

    }
}
