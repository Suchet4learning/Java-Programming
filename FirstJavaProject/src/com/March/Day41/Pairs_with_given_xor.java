/*
Problem Description
Given an integer array A containing N distinct integers.
Find the number of unique pairs of integers in the array whose XOR is equal to B.
NOTE:
Pair (a, b) and (b, a) is considered to be the same and should be counted once.

Problem Constraints
1 <= N <= 105
1 <= A[i], B <= 107

Input Format
The first argument is an integer array A.
The second argument is an integer B.

Output Format
Return a single integer denoting the number of unique pairs of integers in the array A whose XOR is equal to B.

Example Input
Input 1:
 A = [5, 4, 10, 15, 7, 6]
 B = 5
Input 2:
 A = [3, 6, 8, 10, 15, 50]
 B = 5

Example Output
Output 1:
 1
Output 2:
 2

Example Explanation
Explanation 1:
 (10 ^ 15) = 5
Explanation 2:
 (3 ^ 6) = 5 and (10 ^ 15) = 5
 */
package com.March.Day41;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Pairs_with_given_xor {

    public int solve(ArrayList<Integer> A, int B) {
        int ans =0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i< A.size(); i++) {
            if (map.containsKey(A.get(i) ^ B)) {
                ans ++;
            }
            map.put(A.get(i), 1);
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pairs_with_given_xor obj = new Pairs_with_given_xor();
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        int b = sc.nextInt();
        System.out.println(obj.solve(a,b));
    }
}
