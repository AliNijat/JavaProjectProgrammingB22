package Day18_Conditions_practice;

public class FizzBuzzExample {
    public static void main(String[] args) {

        int num = 15;

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println(num + " FizzBuzz number");
        } else if (num % 3 == 0) {
            System.out.println(num + " Fizz number");

        } else if (num % 5 == 0) {
            System.out.println(num + " Buzz number");
        }else {
            System.out.println(num + " Invalid number");
        }

        System.out.println("-----------------------------------------");

        String fizzBuzz = (num % 3 == 0 && num % 3 == 0)? num + " FizzBuzz" : num % 5 == 0 ? num + " Fizz"
                : num % 5 == 0 ? num + " Buzz" : num + " Invalid Number";
        System.out.println(fizzBuzz);

    }
}
