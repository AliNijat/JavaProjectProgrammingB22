package Office_Hours.Practice3_03_15_21;

public class NumDivisibleBy235 {
    public static void main(String[] args) {


        int num = 65;
        boolean by2 = num % 2==0;
        boolean by3 = num % 3 ==0;
        boolean by5 = num % 5 ==0;

        System.out.println(num + "is divisible by 2 = " + by2);
        System.out.println(num + "is divisible by 3 = " + by3);
        System.out.println(num + "is divisible by 5 = " + by5);



    }
}
