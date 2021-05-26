package Quizess;

public class String4Quiz {
    public static void main(String[] args) {


        String ta = "A";
        ta =  ta + "B";
        System.out.println(ta);
        String tb = "C";
        ta = ta + tb;
        System.out.println(ta);
        String tt = ta.replace('C', 'D');
        System.out.println(tt);
        System.out.println(ta);

        System.out.println("----------------------");

        String str = "    batch 22   ";
       int  z= str.trim().length();

        System.out.println(z);

        String s1 = "Wooden spoon";


        String s2 = s1.substring(s1.indexOf("s"));
        System.out.println(s2);


    }
}
