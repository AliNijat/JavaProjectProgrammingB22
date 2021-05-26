package Day01_Java_Intro;

import java.util.ArrayList;
import java.util.List;

public class nunn {
    public static void main(String[] args) {

        System.out.println(method9("lawn", "solar", "activity"));

        double num = add(3.4);
        num += add("doul");
        num += add(Integer.parseInt("100"));
        num += add(Double.parseDouble("50.8"));
        System.out.println(num);

        List<Integer> numw = new ArrayList<>();
        numw.add(2);
        numw.add(0,6);
        numw.add(10);
        System.out.println(numw);

    }
    public static String method9(String one, String two, String three){
        return "" + middle(one) + middle(two) + middle(three);
    }
    public static char middle(String s){
        return s.charAt(s.length()/2);
    }

    public static int add(int i) {
        return 5;
    }
    public static double add(double d){
        return 2.5;

    }
    public static long add(String s){
        return 10;
    }
}
