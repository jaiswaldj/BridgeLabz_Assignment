package com.BridzeLabz.JavaProgram;

public class DuplicateArray {
    public static void main(String[] args) {
       int[] arr = new int[] {1,2,3,4, 4, 5, 5, 6, 6 };

        System.out.println ("Print Duplicate elements in array");

        for(int i =0; i < arr.length; i++) {
            for(int j = i+1; j < arr.length; j++)
            {
                if(arr[i] == arr[j])
                    System.out.println(arr[j]);

            }
        }


    }
}
