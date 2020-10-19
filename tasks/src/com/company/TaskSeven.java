package com.company;

public class TaskSeven {
    public static void Matrix() {
        int[][] mtx = {{4, 5}, {2, 3}};
        int temp = mtx[1][0];
        mtx[1][0] = mtx[0][1];
        mtx[0][1] = temp;
        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                System.out.print(mtx[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
