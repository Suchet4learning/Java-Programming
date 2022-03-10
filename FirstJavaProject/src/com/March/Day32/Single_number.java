/*
Problem Description
Given an array of integers A, every element appears twice except for one. Find that integer that occurs once.
NOTE: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Problem Constraints
2 <= |A| <= 2000000
0 <= A[i] <= INTMAX

Input Format
The first and only argument of input contains an integer array A.

Output Format
Return a single integer denoting the single element.

Example Input
Input 1:
 A = [1, 2, 2, 3, 1]
Input 2:
 A = [1, 2, 2]

Example Output
Output 1:
 3
Output 2:
 1

Example Explanation
Explanation 1:
3 occurs once.
Explanation 2:
1 occurs once.
 */
package com.March.Day32;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Single_number {

    public int singleNumber(final List<Integer> A) {
        int res=0;
        for (int i : A) {
            res ^= i;
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        Single_number obj = new Single_number();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.singleNumber(a));
    }
}
