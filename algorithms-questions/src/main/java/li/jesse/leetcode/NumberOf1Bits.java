package li.jesse.leetcode;

/*
191. Number of 1 Bits
Easy

Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 */

public class NumberOf1Bits
{
    public static int hammingWeight(int n)
    {
        int total = 0;
        while(n != 0)
        {
            total++;
            n = n & (n - 1);
        }

        return total;
    }
}