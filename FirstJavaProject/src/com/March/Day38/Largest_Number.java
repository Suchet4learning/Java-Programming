/*
Problem Description
Given an array A of non-negative integers, arrange them such that they form the largest number.
Note: The result may be very large, so you need to return a string instead of an integer.

Problem Constraints
1 <= len(A) <= 100000
0 <= A[i] <= 2*109

Input Format
The first argument is an array of integers.

Output Format
Return a string representing the largest number.

Example Input
Input 1:
 A = [3, 30, 34, 5, 9]
Input 2:
 A = [2, 3, 9, 0]

Example Output
Output 1:
 "9534330"
Output 2:
 "9320"

Example Explanation
Explanation 1:
Reorder the numbers to [9, 5, 34, 3, 30] to form the largest number.
Explanation 2:
Reorder the numbers to [9, 3, 2, 0] to form the largest number 9320.
 */
package com.March.Day38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Largest_Number {

    public String largestNumber(final List<Integer> A) {

        String ans = "";
        Collections.sort(A);
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Largest_Number obj = new Largest_Number();
        List<Integer> a = new ArrayList<>();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.largestNumber(a));
    }
}
