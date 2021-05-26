package Quizess;

public class Quiz1 {
    public static void main(String[] args) {

        // Q. 3 in quiz one
        int s = 50, tea;
        s = 100;
        System.out.println(s);

        int n = 50;
        int n2 = 200;
         n2 = n;
        System.out.println(n);
        System.out.println(n2);

        long a = 30l;
        long b = (short)a;
        System.out.println(b);
        System.out.println("-----------");

        float aa = 100.987_6543f;
        short  bb = (byte)aa;
        byte cc = (byte) bb;
        System.out.println(cc);

        long a1 = 3_000l;
        double b1 = (float)a1;
        System.out.println(b1);

        int i = 100;
        double d = 123;
        float f = 300;
         // d > f > i
      /*
        i = f; // compile, cause  f > i
        f = i ;  f > i
        d = f;   d > f
        f = d; // compile,  cause  f < d
        d = i;   d > i
        i = d; // compile,  cause  i < d

       */



        System.out.println("______________________");
        System.out.println("result A" + 0 + 1);
        System.out.println("result B" + (1) + (2));

        System.out.println("_______________________");
        System.out.println("5 + 2 = " + 3 + 4);
        System.out.println("5 + 2 = " + (3 + 4));


    }
}
