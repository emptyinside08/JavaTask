package com.company;

public class TaskThree {
   public static boolean t3 (String str){
        String str2 =  new StringBuilder(str).reverse().toString();
        str = str.replaceAll("\\s+","");
        str2 = str2.replaceAll("\\s+","");
       if(str.equalsIgnoreCase(str2)){
            System.out.println("True");
            return true;
        }
        System.out.println("False");
        return false;
    }
}
