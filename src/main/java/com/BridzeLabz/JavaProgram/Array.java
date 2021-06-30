package com.BridzeLabz.JavaProgram;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long[] arr = new long[] { 987, 76, 5646, 96,8768, 8767 };
        int temp = 0;

        Arrays.sort(arr);
        for (int i = 0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("Sort array: ");

        for(int i = 0; i< arr.length; i++) {
            for (int j = i + 1; i < arr.length; i++) {
                if(arr[i] % 2 == 0)
                {
                     temp = (int) arr[i];
                     arr[i] = arr[i];
                     arr[i] = temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
