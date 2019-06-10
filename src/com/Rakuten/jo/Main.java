/*
I didn't print the explanation of this problem.
The function must return the XOR product of every integers between a given M an N.
M and N are integers within the range [1..100000]

Ex M=5, N=8 :
    res = 5^6^7^8
    res = 101^110^111^1000
    res =   011  ^  1111
    res =      1100
    res = 12
*/


package com.Rakuten.jo;

public class Main {

    public static void main(String[] args) {
        int M = 5;
        int N = 8;

        System.out.println("XOR Result =" +(XORTrick(N) ^ XORTrick(M -1)));
    }

    static int XORTrick(int n)
    {
        if (n % 4 == 0)
            return n;

        if (n % 4 == 1)
            return 1;

        if (n % 4 == 2)
            return n + 1;

        return 0;
    }
}


//101 110 111 1000
//0110 0111 1000 1001