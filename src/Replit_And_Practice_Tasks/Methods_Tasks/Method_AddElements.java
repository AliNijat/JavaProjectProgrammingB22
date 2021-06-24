package Replit_And_Practice_Tasks.Methods_Tasks;

public class Method_AddElements {

    public static int[] addElements(int[] ints1, int[] ints2) {

        int [] newArr = new int [ints1.length];
        for (int i = 0; i < newArr.length; i++){

            newArr[i] = ints1[i] + ints2[i];

        }

        return newArr;
    }
}
