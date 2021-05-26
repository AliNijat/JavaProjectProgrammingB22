package Day35_CustomMethods_With_Para;

public class Counters {
    public static void main(String[] args) {
        count(5);

        int num = 999;
        count(num);

        System.out.println();
        String word = "wooden spoon";
        count(word.length());

        printAge(1989);
        age(2021, 1989);
        System.out.println();
        showSum(20.01, 99.99);

    }
    public static void count(int num){
        for (int i = 0; i <= num ; i++) {
            System.out.print(i );
            System.out.print(", ");
        }
        System.out.println();
    }
    public static void printAge (int BirthYear){
        int age = 2021 - BirthYear;
        System.out.println("Your birth year is " + BirthYear +"s");
        System.out.println("You are " + age + " years old!");
        System.out.println("you have only +50 years to use");
    }
    public static void age(int currentYear, int birthYear){
        int yourAge = currentYear - birthYear;
        System.out.println("You are " + yourAge + " years old");
    }
    public static void showSum(double num1, double num2){
        double sum = num1 + num2;
        System.out.println("Sum of " + num1 + " + " + num2 + " is " + sum);
    }
}
