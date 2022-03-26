/*
Problem Description
Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
We will use the integers 0, 1, and 2 to represent red, white, and blue, respectively.
Note: Using the library sort function is not allowed.

Problem Constraints
1 <= N <= 1000000
0 <= A[i] <= 2

Input Format
First and only argument of input contains an integer array A.

Output Format
Return an integer array in asked order

Example Input
Input 1 :
    A = [0 1 2 0 1 2]
Input 2:
    A = [0]

Example Output
Output 1:
    [0 0 1 1 2 2]
Output 2:
    [0]

Example Explanation
Explanation 1:
    [0 0 1 1 2 2] is the required order.
 */
package com.March.Day38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sort_by_Color {

    int min = Integer.MAX_VALUE;

    public ArrayList<Integer> sortColors(ArrayList<Integer> A) {

        int j = A.size()-1, k = 0, temp=0;
        ArrayList<Integer> B = new ArrayList<>(A);

        for (int i: A) {
            if (i == 0) {
                B.set(k, i);
                k++;
            }
            else if (i == 2) {
                B.set(j, i);
                j--;
            }
        }
        for (int m=k; m<=j; m++) {
            B.set(m,1);
        }
        return B;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sort_by_Color obj = new Sort_by_Color();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(obj.sortColors(a));
    }
}
