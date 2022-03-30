/*
Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.
Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.
Incase of conflict, return the substring which occurs first ( with the least starting index).

Problem Constraints
1 <= N <= 10000

Input Format
First and only argument is a string A.

Output Format
Return a string denoting the longest palindromic substring of string A.

Example Input
A = "aaaabaaa"

Example Output
"aaabaaa"

Example Explanation
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
 */
package com.March.Day39;

import java.util.ArrayList;
import java.util.Scanner;

public class Longest_Palindromic_Substring {

    public String longestPalindrome(String A) {

        int j, k, count=0, str=0, end=0;

        for (int i=1; i<A.length(); i++) {
            j=i-1; k=i+1;
            while (j >= 0 && k < A.length()) {
                if (A.charAt(j) == A.charAt(k)) {
                   if ((k-j) > count) {
                       count = k - j;
                       str = j;
                       end = k;
                   }
                }
                else break;
                j--; k++;
            }
        }

        for (int i=0; i<A.length(); i++) {
            j=i; k=i+1;
            while (j >= 0 && k < A.length()) {
                if (A.charAt(j) == A.charAt(k)) {
                    if ((k-j) > count) {
                        count = k - j;
                        str = j;
                        end = k;
                    }
                }
                else break;
                j--; k++;
            }
        }
        return A.substring(str, end+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Longest_Palindromic_Substring obj = new Longest_Palindromic_Substring();
        String s = sc.nextLine();
        System.out.println(obj.longestPalindrome(s));
    }
}
