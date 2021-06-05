package com.BridzeLabz.Day1;

/**
 * created by: BridgeLabz
 * Date 02/06/2021
 *
 * @Author - Deepak Jaiswal
 * Purpose:check whether it is a Leap Year or not.
 **/

public class LeapYear
{
    public static boolean leapYearCheaker(int year)
    {
        if(year>1000)
        {
            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Utility u=new Utility();
        System.out.println("Enter a leap year:");
        int year=u.inputInteger();
        boolean result = leapYearCheaker(year);

        if(result)
        {
            System.out.println("Year:"+ year + " is a leap year");
        }
        else
        {
            System.out.println("Year:"+ year + " is not a leap year");
        }
    }
}
