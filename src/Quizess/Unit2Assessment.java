package Quizess;

import java.util.Arrays;
import java.util.Locale;

public class Unit2Assessment {
    public static void main(String[] args) {

        String a = "123";
        String b = 5 + 4 + a;
        System.out.print(b);
        String s = "java is fun";
        char c = s.charAt(4);

        if (c == 'a') {
            System.out.println("A");
        } else if (c == ' ') {
            System.out.println("B");
        } else {
            System.out.println("C");
        }


        String Restul = 3425 > (9 * 1000) ? "Garden" : "patio";
        Restul.substring(2);
        System.out.println(Restul);

        String str = "the fox ran under the bridge";
        str = str.substring(4, 17);
        str.toLowerCase(Locale.ROOT);
        System.out.println(str + "gruond");

        String str1 = "the game was tied at 2-2";
        String s2 = str1.substring(5);
        int index1 = str1.indexOf("game");
        int idedxt = s2.indexOf("game");

        // System.out.println(index1 +" " + idedxt);

        String z = "popcorn";

        //  z = z.substring(1, 8);
        // System.out.println(z);

        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        int num = 5;
        while (num < 100) {
            num += num;
        }
        System.out.println(num);
        System.out.println("-------------------");

        String word = "the whole time it was raining.";
        do {
            System.out.print(word.charAt(0));
            word = word.substring(3);
        } while (!word.isEmpty());

        System.out.println("-------------------");

        String ss = "I will find the lost book";
        String w = "";
        for (int index = ss.length() - 1; index <= 0; index--) {
            w += ss.charAt(index);

        }
        System.out.println(w);

        System.out.println("-------------------");

        String ww = "cybertek";

        for (int i = 0; i <= ww.length(); i += 2) {
            //  System.out.print(ww.charAt(i));
        }
        System.out.println("-------------------");

        String input = "today it will be 100 degrees !";
        int n = 0;
        while (n++ < input.length()) {
            if (n == 8) {
                continue;
            } else if (n == 9) {
                break;
            }
            System.out.print(input.charAt(++n ) );
        }
        System.out.print(input.charAt(++n ) + " q 18");

            int total = 0;
            int n1 = 2;
            int n2 = 6;

        for (int i = 0; i < 5; i++) {
            if (i %3 ==0)continue;
            total += n1 + n2;
        }
        System.out.println(total);

        int count = 0;

        for (int i = 0; i < 4; i++) {
            if (i == 3) continue;
            for (int j = i+1; j < 5; j++) {
                count ++;
                if ( j == 3) break;
            }
        }
        System.out.println(count);

       boolean [] bool = {true, false, false};

        String  [] r = {"one", "tow", "three", "four"};
        String [] rr = new String[r.length];

        for (int i = 0; i < r.length; i++) {
            rr[i] = r[i] + r[i].length();


        }
        System.out.println(Arrays.toString(rr));

        int [] nums = {14, 1, 84, 97, 1243, 46};
        int total1 = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums [i] % 2!=0) {
                total1 += 5;
            }else {
                total1 += 10;
            }
        }
        System.out.println(total1);
        System.out.println("--------------");

        String  [] trre = {"display", "population", "meeting", "copy", "franchise"};
        int e = trre.length;
     //   int y = trre[5].length();

        System.out.println(e + " " + b);


        double [] doub = new double[4];
        doub [0] = 1.0;
        doub [2] = 42.1;
        doub = new  double[ 4];
        doub [1] = 17.2;
        doub [3] = doub.length;
        System.out.println(Arrays.toString(doub));






    }
}
