/*
Problem Description
You are given a N X N integer matrix. You have to find the sum of all the minor diagonal elements of A.
Minor diagonal of a M X M matrix A is a collection of elements A[i, j] such that i + j = M + 1 (where i, j are 1-based).

Problem Constraints
1 <= N <= 103
-1000 <= A[i][j] <= 1000

Input Format
First and only argument is a 2D integer matrix A.

Output Format
Return an integer denoting the sum of minor diagonal elements.

Example Input
Input 1:
 A = [[1, -2, -3],
      [-4, 5, -6],
      [-7, -8, 9]]
Input 2:
 A = [[3, 2],
      [2, 3]]

Example Output
Output 1:
 -5
Output 2:
 4

Example Explanation
Explanation 1:
 A[1][3] + A[2][2] + A[3][1] = (-3) + 5 + (-7) = -5
Explanation 2:
 A[1][2] + A[2][1] = 2 + 2 = 4
 */

package com.March.Day30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Minor_Diagonal_Sum {

    public int solve(final List<ArrayList<Integer>> A) {

        int ans=0, x, y;

            y=A.size()-1; x=0;
            while (x<A.size() && y>=0) {
                ans = ans + A.get(x).get(y);
                y--;x++;
            }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        Minor_Diagonal_Sum obj = new Minor_Diagonal_Sum();

        for (int i = 0; i < r; i++) {
            a.add(new ArrayList<>());
            for (int j = 0; j < c; j++) {
                a.get(i).add(sc.nextInt());
            }
        }

        System.out.println(obj.solve(a));
    }
}
