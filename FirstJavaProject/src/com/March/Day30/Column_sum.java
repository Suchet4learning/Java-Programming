/*
Problem Description
You are given a 2D integer matrix A, return a 1D integer vector containing column-wise sums of original matrix.

Problem Constraints
1 <= A.size() <= 103
1 <= A[i].size() <= 103
1 <= A[i][j] <= 103

Input Format
First argument is a vector of vector of integers.(2D matrix).

Output Format
Return a vector conatining column-wise sums of original matrix.

Example Input
Input 1:
[1,2,3,4]
[5,6,7,8]
[9,2,3,4]

Example Output
Output 1:
{15,10,13,16}

Example Explanation
Explanation 1
Column 1 = 1+5+9 = 15
Column 2 = 2+6+2 = 10
Column 3 = 3+7+3 = 13
Column 4 = 4+8+4 = 16
 */

package com.March.Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class Column_sum {

    public ArrayList<Integer> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<Integer> B = new ArrayList<>();
        int sum, x=0;

        for (int j=0; j<A.get(0).size(); j++) {
            sum =0;
            for (int i=0; i<A.size();i++) {
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
        Column_sum obj = new Column_sum();

        for (int i=0; i<r; i++) {
            a.add(new ArrayList<>());
            for (int j=0; j<c; j++) {
                a.get(i).add(sc.nextInt());
            }
        }
        System.out.println(obj.solve(a));
    }
}
