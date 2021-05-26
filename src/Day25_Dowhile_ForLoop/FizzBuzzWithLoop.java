package Day25_Dowhile_ForLoop;

public class FizzBuzzWithLoop {
    public static void main(String[] args) {

        int num = 0;

        for (num = 0; num <= 100; num++) {

            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print(num + " FizzBuzz number ");
                System.out.println(";\n");
            } else if (num % 3 == 0) {
                System.out.print(num + " Fizz number ");

            } else if (num % 5 == 0) {
                System.out.print(num + " Buzz number \n");

            } else {
                System.out.print(num + " Invalid number ");
            }
            //System.out.println();
        }

        System.out.println("\n-----------------------------------------");

        String fizzBuzz = (num % 3 == 0 && num % 5 == 0) ? num + " FizzBuzz" : num % 5 == 0 ? num + " Fizz"
                : num % 5 == 0 ? num + " Buzz" : num + " Invalid Number";
        System.out.println(fizzBuzz);


    }
}
