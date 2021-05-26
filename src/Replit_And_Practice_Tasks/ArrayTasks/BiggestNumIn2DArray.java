package Replit_And_Practice_Tasks.ArrayTasks;

public class BiggestNumIn2DArray {
    public static void main(String[] args) {

        int[][] arr = {{20, 10, 5}, {40, 30, 15}};
        int biggestNum = 0;

        for (int i = 0; i < arr[0].length; i++) {
          //  biggestNum = arr[i];
            for (int j = 0; j < arr[1].length; j++) {
                biggestNum = arr[i][j];
            }//end for cols
        }//end for rows

        //TODO write your code below

        System.out.println(biggestNum);

    }
}
