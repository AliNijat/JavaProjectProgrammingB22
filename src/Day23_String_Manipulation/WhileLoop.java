package Day23_String_Manipulation;

public class WhileLoop {
    public static void main(String[] args) {
        int i = 10;
        if (i <= 5) {
            System.out.println(i);
        }

        while (i <= 20) {
            i++;
            System.out.print(i + " ");
            System.out.print(i);

        }
        System.out.println();

        String ii = "Looping";
        int e = 0;
        while (e <= 15) {
            ii +=e;
            System.out.println(ii);

        }
    }
}
