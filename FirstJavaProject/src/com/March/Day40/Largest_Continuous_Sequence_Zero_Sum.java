/*
Problem Description
Given an array A of N integers.
Find the largest continuous sequence in a array which sums to zero.

Problem Constraints
1 <= N <= 106
-107 <= A[i] <= 107

Input Format
Single argument which is an integer array A.

Output Format
Return an array denoting the longest continuous sequence with total sum of zero.

NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.

Example Input
A = [1,2,-2,4,-4]

Example Output
[2,-2,4,-4]

Example Explanation
[2,-2,4,-4] is the longest sequence with total sum of zero.
 */
package com.March.Day40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Largest_Continuous_Sequence_Zero_Sum {

    public ArrayList<Integer> lszero(ArrayList<Integer> A) {

        int str=0, end=0, val=0, max=0;
        ArrayList<Integer> B = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,-1);
        for (int i=0; i<A.size(); i++) {
            val = val + A.get(i);
            if (map.containsKey(val)) {
                if (i - map.get(val) > max) {
                    max = i - map.get(val);
                    str = map.get(val);
                    end = i;
                }
            }
            else {
                map.put(val, i);
            }
        }

        for (int i=str+1; i<=end; i++) {
            B.add(A.get(i));
        }
        return B;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        Largest_Continuous_Sequence_Zero_Sum obj = new Largest_Continuous_Sequence_Zero_Sum();
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(obj.lszero(a));
    }
}
