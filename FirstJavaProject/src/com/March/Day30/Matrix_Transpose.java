/*
Problem Description
You are given a matrix A, you have to return another matrix which is the transpose of A.
NOTE: Transpose of a matrix A is defined as - AT[i][j] = A[j][i] ; Where 1 ≤ i ≤ col and 1 ≤ j ≤ row

Problem Constraints
1 <= A.size() <= 1000
1 <= A[i].size() <= 1000
1 <= A[i][j] <= 1000

Input Format
First argument is vector of vector of integers A representing matrix.

Output Format
You have to return a vector of vector of integers after doing required operations.

Example Input
Input 1:
A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
Input 2:
A = [[1, 2],[1, 2],[1, 2]]

Example Output
Output 1:
[[1, 4, 7], [2, 5, 8], [3, 6, 9]]
Output 2:
[[1, 1, 1], [2, 2, 2]]

Example Explanation
Explanation 1:
Cearly after converting rows to column and columns to rows of [[1, 2, 3],[4, 5, 6],[7, 8, 9]] we will get [[1, 4, 7], [2, 5, 8], [3, 6, 9]].

 */

package com.March.Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix_Transpose {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();

        for (int i=0; i<A.get(0).size(); i++) {
            B.add(new ArrayList<>());
            for (int j=0; j<A.size(); j++) {
                B.get(i).add(A.get(j).get(i));
            }
        }
        return B;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        Matrix_Transpose obj = new Matrix_Transpose();

        for (int i=0; i<r; i++) {
            a.add(new ArrayList<>());
            for (int j=0; j<c; j++) {
                a.get(i).add(sc.nextInt());
            }
        }
        System.out.println(obj.solve(a));
    }
}


