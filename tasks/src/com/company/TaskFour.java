package com.company;

public class TaskFour {
    public static boolean horse(int xCur, int yCur, int xNext, int yNext){
        /*
        int[][] chess = {{0,1,0,1,0,1,0,1},
                         {1,0,1,0,1,0,1,0},
                         {0,1,0,1,0,1,0,1},
                         {1,0,1,0,1,0,1,0},
                         {0,1,0,1,0,1,0,1},
                         {1,0,1,0,1,0,1,0},
                         {0,1,0,1,0,1,0,1},
                         {1,0,1,0,1,0,1,0}};

        return chess[xCur][yCur] != chess[xNext][yNext]
                && (Math.max(xNext,xCur) - Math.min(xNext,xCur)) <= 2
                && (Math.max(yNext,yCur) - Math.min(yNext,yCur)) <= 2;
         */
        int x = Math.abs(xNext - xCur);
        int y = Math.abs(yNext - yCur);
        return x == 1 && y == 2 || x == 2 && y == 1;
    }
}
