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
 A = [1, 3, 5]
 B = [1, 2, 3]
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

public class Christmas_trees {

    public int solve(ArrayList<Integer> A, ArrayList<Integer> B) {

        int sum = -1, min, min1, max_a=Integer.MIN_VALUE, max_b=Integer.MIN_VALUE;
        int m1,m2,m3, total=Integer.MAX_VALUE;

        for (int i=0; i<A.size();i++) {
            if ( A.get(i)>max_a){
                max_b=max_a;
                max_a=A.get(i);
            }
            else if (A.get(i)>max_b){
                max_b=A.get(i);
            }
        }

        for (int k=0; k<=A.size()-3; k++) {
            if (A.get(k)==max_a||A.get(k)==max_b) continue;
                min = A.get(k);
                m1 = k;
                for (int i = k + 1; i <= A.size() - 2; i++) {
                    if (A.get(i)==max_a) continue;
                    if (A.get(i) > min) {
                        min1 = A.get(i);
                        m2 = i;
                        for (int j = i + 1; j <= A.size() - 1; j++) {
                            if (A.get(j) > min1) {
                                m3 = j;
                                sum = B.get(m1) + B.get(m2) + B.get(m3);
                                if (sum < total) total = sum;
                            }
                        }
                    }
                }
        }
        if (sum < 0) total=sum;
        return total;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        Christmas_trees obj = new Christmas_trees();

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
