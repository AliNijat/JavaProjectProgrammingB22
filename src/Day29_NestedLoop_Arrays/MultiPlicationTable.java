package Day29_NestedLoop_Arrays;

public class MultiPlicationTable {
    public static void main(String[] args) {

        for (int i = 10; i >= 1; i--) {

            for (int n = 1; n <= 10; n++) {
                System.out.print(i + " * " + n + " = " + (n * i) + "\t");
            }
            System.out.println();
        }
    }
}
