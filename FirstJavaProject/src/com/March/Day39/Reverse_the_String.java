/*
Problem Description
You are given a string A of size N.
Return the string A after reversing the string word by word.

NOTE:
A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.

Problem Constraints
1 <= N <= 3 * 105

Input Format
The only argument given is string A.

Output Format
Return the string A after reversing the string word by word.

Example Input
Input 1:
    A = "the sky is blue"
Input 2:
    A = "this is ib"

Example Output
Output 1:
    "blue is sky the"
Output 2:
    "ib is this"

Example Explanation
Explanation 1:
    We reverse the string word by word so the string becomes "the sky is blue".
Explanation 2:
    We reverse the string word by word so the string becomes "this is ib".
 */
package com.March.Day39;

import java.util.Scanner;

public class Reverse_the_String {
    public String solve(String A) {

        A = A.trim();
        StringBuilder B = new StringBuilder();
        int n = A.length(), j;
        char c = Character.MIN_VALUE;

        for (int i=A.length()-1; i>=0; i--) {
            if (A.charAt(i) == ' ' || i==0) {
                j = i+1;
                if (i==0) j = i;
                B.append(A.substring(j,n));
                if (c != ' ' && A.charAt(i)==' ') {
                    B.append(A.charAt(i));
                }
                n = i;
            }
            c = A.charAt(i);
        }
        return B.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Reverse_the_String obj = new Reverse_the_String();
        System.out.println(obj.solve(s));
    }
}
