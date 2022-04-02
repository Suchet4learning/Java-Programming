/*
Problem Description
Given an array of integers A, find and return whether the given array contains a non-empty subarray with a sum equal to 0.
If the given array contains a sub-array with sum zero return 1, else return 0.

Problem Constraints
1 <= |A| <= 100000
-10^9 <= A[i] <= 10^9

Input Format
The only argument given is the integer array A.

Output Format
Return whether the given array contains a subarray with a sum equal to 0.

Example Input
Input 1:
 A = [1, 2, 3, 4, 5]
Input 2:
 A = [-1, 1]

Example Output
Output 1:
 0
Output 2:
 1

Example Explanation

Explanation 1:
 No subarray has sum 0.

Explanation 2:
 The array has sum 0.
 */
package com.March.Day40;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Sub_array_with_0_sum {

    public int solve(ArrayList<Integer> A) {
        long val = 0;
        int ans=0;
        HashSet<Long> set = new HashSet<>();
        set.add(val);
        for (int i=0; i<A.size(); i++) {
            val = val + A.get(i);
            if (set.contains(val)) {
                ans = 1;
                return ans;
            }
            else {
                set.add(val);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        Sub_array_with_0_sum obj = new Sub_array_with_0_sum();
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(obj.solve(a));
    }
}
