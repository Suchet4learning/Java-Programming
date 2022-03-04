/*

Problem Description
You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.

Problem Constraints
1 <= A.size(), B.size() <= 1000
1 <= A[i].size(), B[i].size() <= 1000
1 <= A[i][j], B[i][j] <= 1000

Input Format
First argument is vector of vector of integers representing matrix A.
Second argument is vecotor of vector of integers representing matrix B.

Output Format
You have to return a vector of vector of integers after doing required operations.

Example Input

Input 1:

A = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
B = [[9, 8, 7],[6, 5, 4],[3, 2, 1]]

Example Output

Output 1:
[[10, 10, 10], [10, 10, 10], [10, 10, 10]]

Example Explanation

Explanation 1:
A + B = [[1+9, 2+8, 3+7],[4+6, 5+5, 6+4],[7+3, 8+2, 9+1]] = [[10, 10, 10], [10, 10, 10], [10, 10, 10]].

 */

package com.March.Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class Add_Matrices {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<ArrayList<Integer>> C = new ArrayList<>();
        int res;
         for (int i = 0; i<A.size(); i++) {
             C.add(new ArrayList<>());
             for (int j=0; j<A.get(i).size(); j++) {
                 res = A.get(i).get(j) + B.get(i).get(j);
                 C.get(i).add(res);
             }
         }
         return C;
    }


    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        Add_Matrices obj = new Add_Matrices();

        Scanner sc = new Scanner(System.in);

            int row = sc.nextInt();
            int col = sc.nextInt();

            for (int i = 0; i < row; i++) {
                a.add(new ArrayList<>());
                for (int j = 0; j < col; j++) {
                    a.get(i).add(sc.nextInt());
                }
            }

            row = sc.nextInt();
            col = sc.nextInt();

            for (int i = 0; i < row; i++) {
                b.add(new ArrayList<>());
                for (int j = 0; j < col; j++) {
                    b.get(i).add(sc.nextInt());
                }
            }

        System.out.println(obj.solve(a,b));
    }

}
