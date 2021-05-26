package Day26_ForLoop_Continue;

public class ForLoopExampleMultip {
    public static void main(String[] args) {

                                                                                                               System.out.println("_________________________________________________________________________" +
                                                                                                                     "__________________________________________________________________");
        int num = 5;

        for (int i = 1; i <= num; i++) {

            for (int j = 1 ; j <= 10; j++) {


                System.out.print(i + " X " + num + " = " + num * i + " || ");

            }
            System.out.println();

        }
        System.out.println();
    }
}
