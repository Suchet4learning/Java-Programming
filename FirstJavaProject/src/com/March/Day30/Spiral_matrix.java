/*
Problem Description
Given an integer A, generate a square matrix filled with elements from 1 to A2 in spiral order.

Problem Constraints
1 <= A <= 1000

Input Format
First and only argument is integer A

Output Format
Return a 2-D matrix which consists of the elements in spiral order.

Example Input
Input 1:
1
Input 2:
2

Example Output
Output 1:
[ [1] ]
Output 2:
[ [1, 2], [4, 3] ]

Example Explanation
Explanation 1:
Only 1 is to be arranged.
Explanation 2:
1 --> 2
      |
      |
4<--- 3
 */


package com.March.Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class Spiral_matrix {

    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int c_s=0, c_e=A-1, r_s=0, r_e=A-1, x=1, i, j;

        for(i=0; i<A; i++){
            res.add(new ArrayList<>());
            for (j=0; j<A; j++){
                res.get(i).add(0);
            }
        }

        while (x <=A*A) {

            for (i=c_s; i<=c_e; i++) {
                res.get(r_s).set(i,x);
                x++;
            }

            r_s++;
            for (i=r_s; i<=r_e; i++) {
                res.get(i).set(c_e,x);
                x++;
            }

            c_e--;
            for (i=c_e; i>=c_s; i--) {
                res.get(r_e).set(i,x);
                x++;
            }

            r_e--;
            for (i=r_e; i>=r_s; i--) {
                res.get(i).set(c_s,x);
                x++;
            }
            c_s++;

        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Spiral_matrix obj = new Spiral_matrix();

        System.out.println(obj.generateMatrix(n));
    }
}
