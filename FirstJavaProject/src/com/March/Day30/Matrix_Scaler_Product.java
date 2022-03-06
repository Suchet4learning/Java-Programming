/*
Problem Description
You are given a matrix A and an integer B, you have to perform scalar multiplication of matrix A with an integer B.

Problem Constraints
1 <= A.size() <= 1000
1 <= A[i].size() <= 1000
1 <= A[i][j] <= 1000
1 <= B <= 1000

Input Format
First argument is 2D array of integers A representing matrix.
Second argument is an integer B.

Output Format
You have to return a 2D array of integers after doing required operations.

Example Input
Input 1:
A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
B = 2

Example Output
Output 1:
[[2, 4, 6], [8, 10, 12], [14, 16, 18]]

Example Explanation
Explanation 1:
==> ( [[1, 2, 3],[4, 5, 6],[7, 8, 9]] ) * 2
==> [[2*1, 2*2, 2*3],[2*4, 2*5, 2*6],[2*7, 2*8, 2*9]]
==> [[2, 4, 6], [8, 10, 12], [14, 16, 18]]
 */

package com.March.Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix_Scaler_Product {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        for (int i=0; i<A.size(); i++){
            for (int j=0; j<A.get(i).size(); j++) {
               int temp = A.get(i).get(j) * B;
               A.get(i).set(j,temp);
            }
        }
        return A;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        Matrix_Scaler_Product obj = new Matrix_Scaler_Product();

        for (int i=0; i<r; i++) {
            a.add(new ArrayList<>());
            for (int j=0; j<c; j++) {
                a.get(i).add(sc.nextInt());
            }
        }
        int b = sc.nextInt();
        System.out.println(obj.solve(a,b));
    }

}
