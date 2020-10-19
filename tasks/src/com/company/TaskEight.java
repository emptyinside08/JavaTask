package com.company;

public class TaskEight {
    public static void Multiply() {
        int[][] mtx1 = {{2, -3, 1}, {5, 4, -2}};
        int[][] mtx2 = {{-7, 5}, {2, -1},{4, 3}};
        int m = mtx1.length;
        int n = mtx2[0].length;
        int o = mtx2.length;
        int[][] mtx3 = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    mtx3[i][j] += mtx1[i][k] * mtx2[k][j];
                }
            }
        }

        for (int i = 0; i < mtx3.length; i++) {
            for (int j = 0; j < mtx3[i].length; j++) {
                System.out.print(mtx3[i][j]+ "\t");
            }
            System.out.println();
        }
    }
}
