package Replit_And_Practice_Tasks.ArrayTasks;

import java.util.Scanner;

public class MaxFrom2DArray {
    public static void main(String[] args) {

        int [][] num1 = {{10, 30, 40}, {21, 31, 41}};
        int [][] num2 = {{100, 300, 400}, {210, 310, 410}};

        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for(int i=0 ;i<=rows-1;i++)
        {
            for(int j=0 ;j<=cols-1;j++)
            {
                arr[i][j]=inp.nextInt();
            }//end for cols
        }
        System.out.println(rows);
        System.out.println(cols);


        // for finding the maximum
        int largestNum = arr[0][0];

        for (int i = 0; i <= rows-1; i++) {
            for (int j = 0; j <= cols-1; j++) {

                if (largestNum < arr[i][j]){
                    largestNum = arr[i][j];
                }else {
                    largestNum = largestNum;
                }
            }
        }
        System.out.println(largestNum);

    }
}
