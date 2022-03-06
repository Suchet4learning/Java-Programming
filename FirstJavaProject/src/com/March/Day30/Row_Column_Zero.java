/*
Problem Description
You are given a 2D integer matrix A, make all the elements in a row or column zero if the A[i][j] = 0. Specifically, make entire ith row and jth column zero.

Problem Constraints
1 <= A.size() <= 103
1 <= A[i].size() <= 103
0 <= A[i][j] <= 103

Input Format
First argument is a vector of vector of integers.(2D matrix).

Output Format
Return a vector of vector after doing required operations.

Example Input
Input 1:
[1,2,3,4]
[5,6,7,0]
[9,2,0,4]
Example Output
Output 1:
[1,2,0,0]
[0,0,0,0]
[0,0,0,0]

Example Explanation
Explanation 1:
A[2][4] = A[3][3] = 0, so make 2nd row, 3rd row, 3rd column and 4th column zero.
 */

package com.March.Day30;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Row_Column_Zero {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {

        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        for (int i=0; i<A.size(); i++) {
            B.add(new ArrayList<>(A.get(i)));
        }
        int x,y;
        for (int i=0; i<A.size(); i++) {
            for (int j=0; j<A.get(i).size(); j++){
                if (A.get(i).get(j) == 0){
                    x=0; y=0;
                    while (x<B.get(i).size()) {
                        B.get(i).set(x,0);
                        x++;
                    }
                    while(y < B.size()) {
                            B.get(y).set(j,0);
                            y++;
                    }
                }
            }
        }
        return B;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        Row_Column_Zero obj = new Row_Column_Zero();

        for (int i = 0; i < r; i++) {
            a.add(new ArrayList<>());
            for (int j = 0; j < c; j++) {
                a.get(i).add(sc.nextInt());
            }
        }
        System.out.println(obj.solve(a));
    }
}
