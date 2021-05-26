package Day11_Comparison_Operators;

public class PrePostIncrDecrOperators2 {
    public static void main(String[] args) {

        int myNum = 99;
        int yNum = ++myNum;
       // int yNum = myNum++;
        System.out.println(myNum);
        System.out.println(yNum); System.out.println("---------------------");

        int a = 50;
        int b = 22; // first step = 22
       // int c = a++ + ++b;  // 73
        int c = b++ + ++b; //    2 step, b++ =23 and ++b


        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);


    }
}
