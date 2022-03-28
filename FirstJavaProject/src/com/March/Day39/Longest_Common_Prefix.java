/*
Problem Description
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".



Problem Constraints
0 <= sum of length of all strings <= 1000000



Input Format
The only argument given is an array of strings A.



Output Format
Return the longest common prefix of all strings in A.



Example Input
Input 1:

A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:
A = ["abab", "ab", "abcd"];

Example Output
Output 1:
"a"
Output 2:
"ab"

Example Explanation
Explanation 1:
Longest common prefix of all the strings is "a".
Explanation 2:
Longest common prefix of all the strings is "ab".
 */
package com.March.Day39;

import java.util.ArrayList;
import java.util.Scanner;

public class Longest_Common_Prefix {

    public String longestCommonPrefix(ArrayList<String> A) {
        int n = 0, i, idx=0,  min=Integer.MAX_VALUE;
        char c, flg = 'Y';
        StringBuilder ans = new StringBuilder();
        for (i=0; i <A.size(); i++) {
            if (A.get(i).length() < min) {
                min = A.get(i).length();
                idx =  i;
            }
        }

        for (int j=0; j<min; j++) {
            c = A.get(idx).charAt(j);
            for (i = 0; i < A.size(); i++) {
                if (A.get(i).charAt(j) != c) {
                    flg = 'N';
                    break;
                }
            }
            if (flg == 'N') {
                break;
            } else {
                ans.append(c);
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Longest_Common_Prefix obj = new Longest_Common_Prefix();
        ArrayList<String> a = new ArrayList<>();
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            a.add(sc.next());
        }
        System.out.println(obj.longestCommonPrefix(a));
    }
}
