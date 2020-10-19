package com.company;

import java.util.Arrays;

import static com.company.TaskOne.t1;
import static com.company.TaskOne.t11;
import static com.company.TaskOne.t12;
import static com.company.TaskTwo.t2;
import static com.company.TaskThree.t3;
import static com.company.TaskFour.horse;
import static com.company.TaskFive.Sort;
import static com.company.TaskSix.Delete;
import static com.company.TaskSeven.Matrix;
import static com.company.TaskEight.Multiply;

public class Main {

    public static void main(String[] args) throws java.lang.Exception {
        t1("Мыло");
        t11("Мыло");
        t12("Мыло");
        t2(125436545);
        t3("Аргентина манит негра");
        System.out.print(horse(1,1,3,2));
        int[] arr = {1,4,6,2,5,9,14,25,8};
        String[] str = {"Hugo","Hulio", "Hugo", "Apache", "Hugo", "Apache"};
        Delete(str);
        Sort(arr);
        Matrix();
        Multiply();

    }


}


