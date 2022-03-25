/*
Problem Description
Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.

Problem Constraints
1 <= |A| <= 2*105
1 <= A[i] <= 107

Input Format
First and only argument is an integer array A.

Output Format
Return 1 if any such integer p is present else, return -1.

Example Input
Input 1:
 A = [3, 2, 1, 3]
Input 2:
 A = [1, 1, 3, 3]

Example Output
Output 1:
 1
Output 2:
 -1

Example Explanation
Explanation 1:
 For integer 2, there are 2 greater elements in the array..
Explanation 2:
 There exist no integer satisfying the required conditions.
 */
package com.March.Day38;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Noble_Integer {

    public int solve(ArrayList<Integer> A) {
        int ans=-1, num=Integer.MIN_VALUE;
        Collections.sort(A);
        //System.out.println(A);
        for (int i=A.size()-1; i>=0; i--) {
            if (A.get(i) == (A.size() - 1 - i)) {
                if (A.get(i)!= num) {
                    ans = 1;
                    break;
                }
            }
            num = A.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Noble_Integer obj = new Noble_Integer();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(obj.solve(a));
    }

}
