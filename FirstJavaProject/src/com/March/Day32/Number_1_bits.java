/*
Problem Description
Write a function that takes an integer and returns the number of 1 bits it has.

Problem Constraints
1 <= A <= 109

Input Format
First and only argument contains integer A

Output Format
Return an integer as the answer

Example Input
Input1:
11

Example Output
Output1:
3

Example Explanation
Explaination1:
11 is represented as 1011 in binary.
 */

package com.March.Day32;

import java.util.Scanner;

public class Number_1_bits {

    public int numSetBits(int A) {

        int res=0;
        while(A!=0) {
            if (A % 2 == 1) res++;
            A = A / 2;
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number_1_bits obj = new Number_1_bits();

        System.out.println(obj.numSetBits(n));

    }
}
