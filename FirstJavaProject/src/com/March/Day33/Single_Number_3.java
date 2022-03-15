/*
Problem Description
Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once.

Problem Constraints
2 <= |A| <= 100000
1 <= A[i] <= 109

Input Format
The first argument is an array of integers of size N.

Output Format
Return an array of two integers that appear only once.

Example Input
Input 1:
A = [1, 2, 3, 1, 2, 4]
Input 2:
A = [1, 2]

Example Output
Output 1:
[3, 4]
Output 2:
[1, 2]

Example Explanation
Explanation 1:
3 and 4 appear only once.
Explanation 2:

1 and 2 appear only once.
 */
package com.March.Day33;

import java.util.ArrayList;
import java.util.Scanner;

public class Single_Number_3 {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> B = new ArrayList<>();
        int BitXor = 0, mask, x=0;

        for (int i=0; i<A.size(); i++) {
            BitXor ^= A.get(i);
        }

        //mask = BitXor & (BitXor-1);
        mask = BitXor & (-BitXor);

        for (int j=0; j<A.size(); j++) {
            if ((mask & A.get(j)) !=0) {
                x ^= A.get(j);
            }
        }

        if((BitXor^x) < x) {
            B.add(BitXor^x);B.add(x);
        }
        else {
            B.add(x);B.add(BitXor^x);
        }

        return B;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Single_Number_3 obj = new Single_Number_3();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.solve(a));

    }

}
