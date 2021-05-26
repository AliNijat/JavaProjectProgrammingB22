package Day25_Dowhile_ForLoop;

public class NaitaLoop {

        public static void main(String[] args) {
            System.out.println("\neven number between 0-100");
            for(int i =1; i<=100; i++){

                if(i%2 ==0){
                    System.out.print(i + " ");
                }
            }
            System.out.println("\n\nodd number between 0-100");

            for(int i =1; i<=100; i++){
                if(i % 2 !=0){
                    System.out.print(i+ " ");
                }
            }
    }
}
