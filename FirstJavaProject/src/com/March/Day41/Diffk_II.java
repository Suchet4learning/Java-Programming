/*
Given an array A of integers and another non-negative integer k, find if there exists 2 indices i and j such that A[i] - A[j] = k, i != j.

Example :

Input :

A : [1 5 3]
k : 2

Output :
1
as 3 - 1 = 2

Return 0 / 1 for this problem.
 */
package com.March.Day41;

import java.util.*;

public class Diffk_II {

    public int diffPossible(final List<Integer> A, int B) {
        HashSet<Integer> set = new HashSet<>();
        for (int i=0; i<A.size(); i++) {
            if (set.contains(A.get(i)-B)) {
                return 1;
            }
            else {
                    set.add(A.get(i));
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Diffk_II obj = new Diffk_II();
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        int b = sc.nextInt();
        System.out.println(obj.diffPossible(a,b));
    }
}
