/*
Problem Description
Given a string A, you are asked to reverse the string and return the reversed string.

Problem Constraints
1 <= |A| <= 105
String A consist only of lowercase characters.

Input Format
First and only argument is a string A.

Output Format
Return a string denoting the reversed string.

Example Input
Input 1:
 A = "scaler"
Input 2:
 A = "academy"

Example Output
Output 1:
 "relacs"
Output 2:
 "ymedaca"

Example Explanation
Explanation 1:
 Reverse the given string.
 */
package com.March.Day39;

import java.util.Scanner;

public class Simple_Reverse {

    public String solve(String A) {

        StringBuilder B = new StringBuilder();
        for (int i=A.length()-1; i>=0; i--) {
            B.append(A.charAt(i));
        }
        return B.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Simple_Reverse obj = new Simple_Reverse();
        System.out.println(obj.solve(s));
    }
}
