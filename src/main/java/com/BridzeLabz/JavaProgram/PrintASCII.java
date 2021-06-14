package com.BridzeLabz.JavaProgram;

/**Two ways to print ASCII value in Java

1 - Assigning a variable to the int Variable
2 - Using Type-Casting*/

public class PrintASCII {
    public static void main(String [] args)
    {
        // Charcater whose ASCII value to be found
        char ch1 = 'a';
        char ch2 = 'b';
        // variable that stores the integer value of the character
        int asciivalue1 =  ch1;
        int asciivalue2 = ch2;
        System.out.println("The ASCII value of " + ch1+ "is: " + asciivalue1);
        System.out.println("The ASCII value of " + ch2 + "is:" + asciivalue2);
    }
}
