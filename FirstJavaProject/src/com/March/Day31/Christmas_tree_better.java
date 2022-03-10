/*
Problem Description
You are given an array A consisting of heights of Christmas trees and an array B of the same size consisting of the cost of each of the trees (Bi is the cost of tree Ai, where 1 ≤ i ≤ size(A)), and you are supposed to choose 3 trees (let's say, indices p, q, and r), such that Ap < Aq < Ar, where p < q < r.
The cost of these trees is Bp + Bq + Br.
You are to choose 3 trees such that their total cost is minimum. Return that cost.
If it is not possible to choose 3 such trees return -1.

Problem Constraints
1 <= A[i], B[i] <= 109
3 <= size(A) = size(B) <= 3000

Input Format
First argument is an integer array A.
Second argument is an integer array B.

Output Format
Return an integer denoting the minimum cost of choosing 3 trees whose heights are strictly in increasing order, if not possible, -1.

Example Input
Input 1:
 A = [1, 3, 5] B = [1, 2, 3]
Input 2:
 A = [1, 6, 4, 2, 6, 9]
 B = [2, 5, 7, 3, 2, 7]

Example Output
Output 1:
 6
Output 2:
7

Example Explanation
Explanation 1:
 We can choose the trees with indices 1, 2 and 3, and the cost is 1 + 2 + 3 = 6.
 */
package com.March.Day31;

import java.util.ArrayList;
import java.util.Scanner;

public class Christmas_tree_better {

    public int solve(ArrayList<Integer>A, ArrayList<Integer> B){

        int sum, min=Integer.MAX_VALUE, m1, m2, m3;

        for (int i=1; i<A.size(); i++) {
            m1 = B.get(i); m2 = Integer.MAX_VALUE; m3=Integer.MAX_VALUE;
            for (int j=i-1; j>=0; j--){
                if (A.get(j) < A.get(i)) {
                    if (B.get(j) < m2) {
                        m2 = B.get(j);
                    }
                }
            }
            if (m2==Integer.MAX_VALUE) continue;

            for (int k=i+1; k<A.size();k++) {
                if (A.get(k) > A.get(i)) {
                    if (B.get(k) < m3) {
                        m3 = B.get(k);
                    }
                }
            }
            if (m3==Integer.MAX_VALUE) continue;

            sum = m1 + m2 + m3;

            if (sum < min) min=sum;
        }
        if (min == Integer.MAX_VALUE) return -1;
        return min;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        Christmas_tree_better obj = new Christmas_tree_better();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        n= sc.nextInt();

        for (int i=0; i<n; i++) {
            b.add(sc.nextInt());
        }

        System.out.println(obj.solve(a,b));

    }
}
