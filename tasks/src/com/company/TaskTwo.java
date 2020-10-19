package com.company;

public class TaskTwo {
    public static boolean t2 (int n){
        for (int i = 2; i != n; ++i){
            if (i % n == 0){
                System.out.println("True");
                return true;
            }
        }
        System.out.println("False");
        return false;
    }

}
