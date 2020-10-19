package com.company;

public class TaskOne {
    public static void t1(String str){
        System.out.println(new StringBuilder(str).reverse());
    }

    // второй способ с созданием велосипеда
    public static void t11 (String str){
        char str2[] = str.toCharArray();
        for (int i = str2.length; i !=  0; i--) {
            System.out.print(str2[i - 1]);
        }
        System.out.println(" ");
    }

    // третьий способ, меньше чем первый

    public static StringBuffer t12(String str){
        StringBuffer str2 =  new StringBuffer(str);
        str2.reverse();
        System.out.println(str2);
        return str2;
    }

}
