package Day30_Array_Intro;

public class ReverseLoopArrays {
    public static void main(String[] args) {


        int [] data = {100, 500, 300, 20, 400, 50};
        for (int i = data.length-1 ; i >= 0; i--) {
            System.out.print(data[i] + " ");

        }
        System.out.println();
        System.out.print(data[0]);
    }
}