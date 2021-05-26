package Day30_Array_Intro;

public class ForEachLoopArray {
    public static void main(String[] args) {

        int [] data = {100, 500, 300, 20, 400, 50};

        for ( int eachNum : data ) {
            System.out.print(data + " ");

        }
        System.out.println();

        for ( int eachNum : data ) {
            System.out.print(eachNum + " ");

        }
        System.out.println();
        System.out.println("-----------------------------");

        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");

        }
        System.out.println();
        System.out.print(data[data.length-1]);


    }
}
