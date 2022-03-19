/*
Problem Description
You are given a number A in the form of a string. Check if the number is divisible by eight or not.
Return 1 if it is divisible by eight else, return 0.

Problem Constraints
1 <= length of the String <= 100000
'0' <= A[i] <= '9'

Input Format
The only argument given is a string A.

Output Format
Return 1 if it is divisible by eight else return 0.

Example Input
Input 1:
A = "16"
Input 2:
A = "123"

Example Output
Output 1:
1
Output 2:
0

Example Explanation
Explanation 1:
 16 = 8 * 2
Explanation 2:
123 = 15 * 8 + 3
 */
package com.March.Day35;

import java.util.Scanner;

public class Divisibility_by_8 {

    public int solve(String A) {

        int n=0, x;
        x = A.length() > 3? A.length()-3:0;

        for (int i=x; i<=A.length()-1; i++)
            n = n * 10 + A.charAt(i) - '0';

        if (n%8==0) return 1;
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Divisibility_by_8 obj = new Divisibility_by_8();

        System.out.println(obj.solve(S));
    }
}
