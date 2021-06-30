package com.BridzeLabz.JavaProgram;

public class ReverseString {
    public static void main(String[] args){
        String str = "Deepak Jaiswal";


        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);

    }
}
