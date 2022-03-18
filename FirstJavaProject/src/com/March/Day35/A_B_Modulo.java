/*
Problem Description
Given two integers A and B, find the greatest possible positive integer M, such that A % M = B % M.

Problem Constraints
1 <= A, B <= 109
A != B

Input Format
The first argument is an integer A.
The second argument is an integer B.

Output Format
Return an integer denoting the greatest possible positive M.

Example Input
Input 1:

A = 1
B = 2
Input 2:
A = 5
B = 10

Example Output
Output 1:
1

Output 2:
5

Example Explanation
Explanation 1:
1 is the largest value of M such that A % M == B % M.

Explanation 2:
For M = 5, A % M = 0 and B % M = 0.
No value greater than M = 5, satisfies the condition.
 */

package com.March.Day35;

import java.util.Scanner;

public class A_B_Modulo {

    public int solve(int A, int B) {

        int n = (A<=B?A:B), M=0;

        if (A>B){
            if (A/B > 0) {
                n = B * (A/B);
            }
        }
        else{
            if (B/A > 0) {
                n = A * (B/A);
            }
        }

        for (int i=n; i>0; i--){
            if (A%i == B%i) {
                M = i;
                break;
            }
        }
        return M;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        A_B_Modulo obj = new A_B_Modulo();

        System.out.println(obj.solve(a,b));

    }
}
