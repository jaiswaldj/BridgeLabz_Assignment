package com.BridzeLabz.Day1;

public class Utility {
    public static int add (int fno, int sno)
    {
        return fno+sno;
    }
    public static int reverse(int number)
    {
        int remainder=0,reverse=0;
        while(number>0)
        {
            remainder=number%10;
            reverse=reverse*10+remainder;
            number=number/10;
        }
        return reverse;
    }
    public int inputInteger() {
        // TODO Auto-generated method stub
        return 0;
    }

}
