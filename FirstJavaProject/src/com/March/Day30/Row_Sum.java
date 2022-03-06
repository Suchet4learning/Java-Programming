/*
Problem Description
You are given a 2D integer matrix A, return a 1D integer vector containing row-wise sums of original matrix.

Problem Constraints
1 <= A.size() <= 103
1 <= A[i].size() <= 103
1 <= A[i][j] <= 103

Input Format
First argument is a vector of vector of integers.(2D matrix).

Output Format
Return a vector containing row-wise sums of original matrix.

Example Input
Input 1:
[1,2,3,4]
[5,6,7,8]
[9,2,3,4]

Example Output
Output 1:
{10,26,18}
Example Explanation
Explanation 1
Row 1 = 1+2+3+4 = 10
Row 2 = 5+6+7+8 = 26
Row 3 = 9+2+3+4 = 18

 */

package com.March.Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class Row_Sum {

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<Integer> B = new ArrayList<>();
        int sum;

        for (int i=0; i<A.size(); i++) {
            sum=0;
            for (int j=0; j<A.get(i).size(); j++) {
                sum = sum + A.get(i).get(j);
            }
            B.add(sum);
        }
        return B;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        Row_Sum obj = new Row_Sum();

        for (int i = 0; i < r; i++) {
            a.add(new ArrayList<>());
            for (int j = 0; j < c; j++) {
                a.get(i).add(sc.nextInt());
            }
        }

        System.out.println(obj.solve(a));
    }

}
