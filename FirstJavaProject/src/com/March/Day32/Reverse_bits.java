/*
Problem Description
Reverse the bits of an 32 bit unsigned integer A.

Problem Constraints
0 <= A <= 232

Input Format
First and only argument of input contains an integer A.

Output Format
Return a single unsigned integer denoting the decimal value of reversed bits.

Example Input
Input 1:
 0
Input 2:
 3

Example Output
Output 1:
 0
Output 2:
 3221225472

Example Explanation
Explanation 1:
        00000000000000000000000000000000
=>      00000000000000000000000000000000
Explanation 2:
        00000000000000000000000000000011
=>      11000000000000000000000000000000
 */

package com.March.Day32;

import java.math.BigInteger;
import java.util.Scanner;

public class Reverse_bits {

    public long reverse(long a) {

        long cnt=0L, ans=0;
        int i=31, p=1;

        while (a > 0){
            cnt = cnt + a % 2 * p;
            a = a/2;
            p = p * 10;
        }

        while (cnt > 0){
            if (cnt % 10 == 1) {
                ans = ans + (long)Math.pow(2,i);
            }
            cnt = cnt/10;
            i--;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        Reverse_bits obj = new Reverse_bits();
        System.out.println(obj.reverse(n));

    }
}
