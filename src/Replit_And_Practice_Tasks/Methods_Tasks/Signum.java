package Replit_And_Practice_Tasks.Methods_Tasks;

/*
Given a method sign write the code so that its takes a number arguement and tells you if its positive, negative or zero.

for example :

sign(5)  => positive
sign(5)  => positive
sign(-30) => negative
sign(-30) => negative
sign(0)  => zero
 */
public class Signum {
    public static void main(String[] args) {

        sign(4);


    }

    public static void sign(int n) {
        //your code here

        String result = n > 0 ? "positive" : n < 0 ? "negative" : "zero";
        System.out.println(result);

//        if (n > 0) {
//            System.out.println("positive");
//        } else if (n < 0) {
//            System.out.println("negative");
//        } else {
//            System.out.println("zero");
//        }

    }
}
