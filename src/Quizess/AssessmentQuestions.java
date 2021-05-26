package Quizess;

import java.util.Scanner;

public class AssessmentQuestions {
    public static void main(String[] args) {

/*
        int na = -5;
        int b = na;
        String st = "";

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(b);
        System.out.println(na++ + ",");
        System.out.println(na = 0);
        System.out.println("," + --na);

        System.out.println("___________________");
        short s = 13 - 9 / 3 * 10;
        s += -10;
        System.out.println(s);

        System.out.println("------------");
        boolean one = ('a' != 'z') && false;
        boolean two = one || 0 == (9 - 10 + 1);
        System.out.println(two);
        System.out.println("___________________");

        long l = 100;
        short ss = (short) l;

        System.out.println(ss + 10);

        System.out.println("___________________");

        int w = 10;
        w = --w + w++ + w-- + w++;
        System.out.println(w);

        System.out.println("___________________");

        short s1 = 13 + 3 * (12 - 6) % 2;
        boolean b1 = s != 25;
        System.out.println("b1 " + b1);
        System.out.println("___________________");

        byte r = 104;
        boolean check = r < 100;
        if (check) {
            r -= 100;
        } else {
            r = 50;
        }
        System.out.println("r " + r);
        System.out.println("___________________");

        if (183 == 13 + 50 * 2 + 70){
            System.out.println("java");
        }else {
            System.out.println("soft skill");
        }
        System.out.println("___________________");

        int cookies = 10;
        String day = "tuesday";
        switch (day){
            case "sunday":
                cookies ++;
            case "monday":
                cookies += 5;
                break;

            case "tuesday":
            case "wednesday":
                cookies += 10;
            case "thursday":
                cookies += 5;
                break;

            case "friday":
                break;

            case "saturday":
                cookies --;
                break;

            default:
                cookies = 0;
        }
        System.out.println(cookies);
        System.out.println("___________________");


        String str = "";
        int num = 20;
        switch (num){
            case 0:
                str = "c#";
            break;
            case 10:
                str += "is";
            case 15:
                str = "fun";
            case 20:
                str += "java ";
            case 25:
                str += "is ";
                break;
            case 30:
                str += "fun";
                break;
            case 35:
                str = "python";
            case 40:
                str += "90";

        }
        System.out.println(str);
        System.out.println("___________________");
    double pi = 3.14;
    boolean bb = 119% 5 ==0;
    int number = 0;
    if (pi > 3.14 && !bb){
        number += 50;
    }else {
        number -= 50;
    }
        if (bb){
            number += 50;
        }
        System.out.println(number);

        System.out.println("-------------------------------------");

        double deci = 13.142;
         int whole = deci < 20? 20: 10;
        System.out.println(whole);

        System.out.println("-------------------------------------");

 */

        String name = "Jimmy";
        boolean check;

        if ( name == "jij"){
            check = false;
        }else
        {
            check = true;
        }
        String str = check ? "5" : "10";
      //  System.out.println( str == 10);

        System.out.println("_______________________________");

        int chek = 132;
        String str1 = "";
        if ( chek % 2 ==0){
            str1 += chek;
            if (chek % 5 == 0){
                str1 += "132";
            }else {
                str1 = "500";
            }
        }else {
            str += "123";
        }
        System.out.println(str1);
        System.out.println("_______________________________");

        int nmm = 2;
        boolean b = true;

        switch (nmm){
            case 0:
            b = false;
            case 1:
                System.out.print(1);
            case 2:
                if (b){
                    System.out.print(2);
                }else {
                    b = false;
                }
            case 3:
                if (b ){
                    System.out.print(3);
                    b = false;
                }else {
                    break;
                }
            case 4:
                System.out.print(4);
            case 5:
                if (!b) {
                    break;
                }
        }
        System.out.print(5);
        System.out.println("------------------------");

        int one = 5;
        int two = 2;
         if ( one-- > two * 2){
             System.out.println("one");
         }else {
             System.out.println(two);
         }
        System.out.println("------------------------");


         String tt = "one";
         int mm = 0;
          switch (tt){
              case "one":
                  mm =1;
                  break;
              case "two":
                  mm = 2;
                  break;
              case  "three":
                  mm = 3;
                  break;
          }
        System.out.println(mm);
        System.out.println("------------------------");

        byte b11 = 100;
        byte b22 = 15;
         int max = (b11 > b22 )? b11 + 2 : b22 - 4;
        System.out.println(max);


        System.out.println("------------------------");

        Scanner input;

        //String first = input.nextLine();


        boolean isTall = true;
        boolean isFast = false;
        boolean isFlex = false;

        String sport = "";

        if (isTall){
            if (isFast){
                sport = "baskeball";

            }else if (isFlex){
                sport = "gymmm";

            }else {
                sport = "volly";
            }
        }else {
            if (isFast){
                sport = "soccer";
            }else {
                sport = "tennis";
            }
        }
        System.out.println(sport);




    }
}
