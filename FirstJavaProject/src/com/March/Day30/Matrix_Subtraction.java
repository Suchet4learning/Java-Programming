/*
Problem Description
You are given two integer matrices A and B having same size(Both having same number of rows (N) and columns (M)). You have to subtract matrix A from B and return the resultant matrix. (i.e. return the matrix A - B).
If X and Y are two matrices of the same order (same dimensions). Then X - Y is a matrix of the same order as X and Y and its elements are obtained by subtracting the elements of Y from the corresponding elements of X. Thus if Z = [z[i][j]] = X - Y, then [z[i][j]] = [x[i][j]] – [y[i][j]].

Problem Constraints
1 <= N, M <= 103
-109 <= A[i][j], B[i][j] <= 109

Input Format
First argument is a 2D integer matrix A.
Second argument is a 2D integer matrix B.

Output Format
Return a 2D matrix denoting A - B.

Example Input
Input 1:
 A = [[1, 2, 3],            B = [[9, 8, 7],
      [4, 5, 6],                 [6, 5, 4],
      [7, 8, 9]]                 [3, 2, 1]]
Input 2:
 A = [[1, 1]]               B = [[2, 3]]

Example Output
Output 1:
 [[-8, -6, -4],
  [-2, 0, 2],
  [4, 6, 8]]
Output 2:
 [[-1, -2]]

Example Explanation
Explanation 1:
 image
Explanation 2:
 [[1, 1]] - [[2, 3]] = [[1 - 2, 1 - 3]] = [[-1, -2]]
 */


package com.March.Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix_Subtraction {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<ArrayList<Integer>> C = new ArrayList<>();

        for (int i=0; i<A.size(); i++) {
            C.add(new ArrayList<>());
            for(int j=0; j<A.get(i).size();j++) {
                C.get(i).add(A.get(i).get(j) - B.get(i).get(j));
            }
        }
        return C;
    }


    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int c = sc.nextInt();
        ArrayList<ArrayList<Integer>> m = new ArrayList<>();
        ArrayList<ArrayList<Integer>> n = new ArrayList<>();
        Matrix_Subtraction obj = new Matrix_Subtraction();

        for (int i=0; i<r; i++) {
            m.add(new ArrayList<>());
            for (int j=0; j<c; j++) {
                m.get(i).add(sc.nextInt());
            }
        }

        r= sc.nextInt();
        c = sc.nextInt();

        for (int i=0; i<r; i++) {
            n.add(new ArrayList<>());
            for (int j=0; j<c; j++) {
                n.get(i).add(sc.nextInt());
            }
        }

        System.out.println(obj.solve(m,n));
    }

}
