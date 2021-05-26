package Day24_Loop_Intro;

public class DoWhileLoopExample {
    public static void main(String[] args) {

        char ch = 0;

        do {
            System.out.print(" " + ch);
            ch ++;

        }while (ch <= 99);

        System.out.println();
        System.out.println("================================================================================");


        int count = 10;
        do {
            System.out.print(count + " ");
            count++;
        }while (count <= 50);

        System.out.println();
        System.out.println("================================================================================");

        int number = 100;
        do {
            System.out.println(number + " ");
            number ++;
        }while (number <=10);


        }


}
