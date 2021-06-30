package com.BridzeLabz.JavaProgram;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args){
        int number, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print Factors");
        number = sc.nextInt();
        for (i = 1 ; i <= number; i++){
            if(number %i == 0)
            number = number * i;
        {
                System.out.println("  " + number);
            }

        }

    }


}
