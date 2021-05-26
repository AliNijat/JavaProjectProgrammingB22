package Day33_Arrays_Continue;

import java.util.Arrays;

public class MultiDArrayExample2 {
    public static void main(String[] args) {

        int[][] nums2D= {
                {12,  55,  4, 7},    //0
                {123, 555, 9},       //1
                {56, 87, 455, 34},   //2
                {234, 12, 54, 23, 23}//3
        };
        System.out.println("nums2D [2][2] = " + nums2D[2][2]);
        System.out.println();

        // for array with different length we using nested loop
        for (int i = 0; i < nums2D.length; i++) {
            for (int j = 0; j < nums2D[i].length; j++) {
                System.out.print(nums2D[i][j]+"\t");
            }
            System.out.println();
        }


    }
}
