package com.BridzeLabz.JavaProgram;

public class SecondSmallest {
    public static int SecondSmallest(int[]a, int total){
        int temp;
        for (int i = 0;  i  < total; i++)
        {
            for(int j = i +1 ; j < total; j++)
            {
                if(a[i] > a[j])

            {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }
    return a[1];
}
public  static void main(String args[]) {
    int a[] = {1,2,5,6,3,2};
    int b[] = {44,66,99,655,11,24};

    System.out.println("second smallest" +SecondSmallest(a,6));
    System.out.println("second smallest" + SecondSmallest(b,6));
}}
