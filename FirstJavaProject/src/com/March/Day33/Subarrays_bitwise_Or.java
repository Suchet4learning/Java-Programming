/*
Problem Description
Given an array B of length A with elements 1 or 0. Find the number of subarrays with bitwise OR 1.

Problem Constraints
1 <= A <= 105

Input Format
The first argument is a single integer A.
The second argument is an integer array B.

Output Format
Return the number of subarrays with bitwise array 1.

Example Input
Input 1:
 A = 3
B = [1, 0, 1]
Input 2:
 A = 2
B = [1, 0]

Example Output
Output 1:
5
Output2:
2

Example Explanation
Explanation 1:
The subarrays are :- [1], [0], [1], [1, 0], [0, 1], [1, 0, 1]
Except the subarray [0] all the other subarrays has a Bitwise OR = 1
Explanation 2:
The subarrays are :- [1], [0], [1, 0]
Except the subarray [0] all the other subarrays has a Bitwise OR = 1
 */
package com.March.Day33;

import java.util.ArrayList;
import java.util.Scanner;

public class Subarrays_bitwise_Or {

    public Long solve(int A, ArrayList<Integer> B) {
        long count = 0L;
        int y;
        for (int x=0; x<B.size(); x++) {
            if ((B.get(x)&(1))!=0) {
                count = count + B.size()-x;
            }
            else {
                y = x;
                while ((B.get(y)&1)==0) {
                    if (y==B.size()-1) {
                        y++;
                        break;
                    }
                    y++;
                }
                count = count + B.size()-y;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Subarrays_bitwise_Or obj = new Subarrays_bitwise_Or();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.solve(n,a));
    }
}
