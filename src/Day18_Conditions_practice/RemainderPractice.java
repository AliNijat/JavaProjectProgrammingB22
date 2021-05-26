package Day18_Conditions_practice;

public class RemainderPractice {
    public static void main(String[] args) {
        int num = 11;

        if (num % 2 != 0){
            System.out.println(num + " is divisible by 2,\nSo it is an even number");
        }else {
            System.out.println(num + " is not divisible by 2,\nSo it is an odd number");

        }

        System.out.println("--------------------------------------");

        String ternary = num % 2 ==0 ? num + " It is an even number" : num + " It is an odd number";
        System.out.println(ternary);
    }
}
