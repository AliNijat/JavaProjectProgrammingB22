package Day25_Dowhile_ForLoop;

public class ForLoopExample {
    public static void main(String[] args) {

        /* Bellow is an infinitive loop

        for (;;){
            System.out.println("Hello world");
        }

         */

        for (int i = 0; i<= 5 && i == 3; i++){
            System.out.println("Hello Loop, don't looping\nmore than 5 time");
        }
        System.out.println("Ok, I stopped");




        int m = 0;
        for (int n = 0; n <= 10; n++){
            n *= n;
            System.out.print(n +" ");
        }

    }
}
