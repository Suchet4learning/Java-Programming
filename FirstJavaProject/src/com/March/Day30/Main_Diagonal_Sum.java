/*
Problem Description
You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.

Problem Constraints
1 <= N <= 103
-1000 <= A[i][j] <= 1000

Input Format
First and only argument is a 2D integer matrix A.

Output Format
Return an integer denoting the sum of main diagonal elements.

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
 15
Output 2:
 6

Example Explanation
Explanation 1:
 A[1][1] + A[2][2] + A[3][3] = 1 + 5 + 9 = 15
Explanation 2:
 A[1][1] + A[2][2] = 3 + 3 = 6
 */

package com.March.Day30;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_Diagonal_Sum {

    public int solve(final List<ArrayList<Integer>> A) {

        int sum = 0;
        int i=0, j=0;
        while(i<A.size() && j<A.get(0).size()) {
            sum = sum + A.get(i).get(j);
            i++;j++;
        }
        return sum;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        Main_Diagonal_Sum obj = new Main_Diagonal_Sum();

        for (int i = 0; i < r; i++) {
            a.add(new ArrayList<>());
            for (int j = 0; j < c; j++) {
                a.get(i).add(sc.nextInt());
            }
        }
        System.out.println(obj.solve(a));
    }

}
