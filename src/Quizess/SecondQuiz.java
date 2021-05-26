package Quizess;

public class SecondQuiz {
    public static void main(String[] args) {

int x = 10;
int y = x++;
        System.out.println(y++ + " " + x++ + " " + y);

        boolean a = true;
        boolean b = !a == false;
        boolean z = b;

        System.out.println(b);
        if (a){
            System.out.println(" a");

        }if (b){
            System.out.println("b");
        }if (z) {
            System.out.println(" z");
        }

        int score = 0;
        if (score ==0){
            score +=50;
        }if (score != 0){
            score +=50;
        }
        System.out.println(score);

        char g = 'A';
        boolean pas1 = g == 'A' || g == 'B';
        boolean pas2 = g == 'C' || g == 'D';
        if ( pas1 || pas2){
            System.out.println("you passed");
        }else {
            System.out.println("you failed");
        }

        int num = 9;
        if (num++ == 10){
            System.out.println("Hello world" + num);
        }else {
            System.out.println("Hello niverse " + num);
        }

        int num1 = 10;
        if (--num1 > 10){
            System.out.println("Hello cybertek" + num1);
        }else if (num1 == 9){
            System.out.println("Hello world " + num1);
        }

        boolean q = true, w = !false;
        if (w){
            System.out.println("w");
        }else if (q){
            System.out.println("q");

        }else {
            System.out.println("o");
        }

    }
}
