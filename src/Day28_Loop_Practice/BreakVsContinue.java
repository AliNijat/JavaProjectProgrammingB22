package Day28_Loop_Practice;

public class BreakVsContinue {
    public static void main(String[] args) {

        System.out.println("-------with Break--------");

        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
            break;
            //  continue;
        }
        System.out.println("-------with continue--------");

        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
            //  break;
            continue;

           // System.out.println("Testing");
        }

        System.out.println("-------without Break and continue--------");

        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
            //  break;
            //  continue;
        }
    }
}
