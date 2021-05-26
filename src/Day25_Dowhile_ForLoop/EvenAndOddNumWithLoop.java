package Day25_Dowhile_ForLoop;

public class EvenAndOddNumWithLoop {
    public static void main(String[] args) {

        int evenNum = 0;
        int oddNum = 0;

        for (int n = 0; n <= 50; n +=1){
            if (n % 2 ==0){
                System.out.println("\t     \t        Even Numbers = " + n);
                evenNum += n;


            }else {
                System.out.print("Odd Numbers = " + n);
                oddNum +=n;
            }

        }
        System.out.println("Sum of Odd numbers + " + oddNum + "\t\t    Sum of Even numbers = " + evenNum);
        System.out.println();



    }
}
