package com.BridzeLabz.JavaProgram;

/** Fibonacci series sum of previous two numbers.

There are two ways to write the Fibonacci series Program

1. Fibonacci Series without using recursion
2. Fibonacci Series  using recursion */



public class FibonacciSeries {
    public static void main(String[] args){
        int n1 = 0, n2 = 1, n3, i, count = 10;
        System.out.println(n1+" "+n2); //printing 0 and 1

        for(i=2; i<count; ++i) //loop starts from 2 because 0 and 1
        {
            n3=n1+n2;
            System.out.println(""+n3);
            n1=n2;
            n2=n3;
        }
    }
}
