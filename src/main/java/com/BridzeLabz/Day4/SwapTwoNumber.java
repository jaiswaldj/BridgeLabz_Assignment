package com.BridzeLabz.Day4;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args){
        int fno, xno, t; // fno and xno are to swap
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of fno and xno");
        fno = sc.nextInt();
        xno = sc.nextInt();
        System.out.println("before swapping numbers: "+fno +" "+ xno);

        /*swapping */
        t = fno;
        fno = xno;
        xno = t;
        System.out.println("After swapping: "+fno +" "+xno);
        System.out.println("After swapping: "+fno +" "+xno);
        System.out.println();
    }

}
