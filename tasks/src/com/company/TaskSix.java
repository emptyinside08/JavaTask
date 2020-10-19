package com.company;

public class TaskSix {
    public static void Delete(String[] str)
    {
        for (int i = 0; i < str.length-1; ++i)
        {
            for(int j = i+1;  j < str.length; ++j)
            {
                if(str[i] == str[j])
                {
                    str[j] = "";
                }
            }
            System.out.print(str[i] + "\t");
        }
    }
}