/*
Problem Description
You are given a function isalpha() consisting of a character array A.
Return 1 if all the characters of the character array are alphabetical (a-z and A-Z), else return 0.

Problem Constraints
1 <= |A| <= 105

Input Format
Only argument is a character array A.

Output Format
Return 1 if all the characters of the character array are alphabetical (a-z and A-Z), else return 0.

Example Input
Input 1:
 A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y']
Input 2:
 A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']

Example Output
Output 1:
 1
Output 2:
 0

Example Explanation
Explanation 1:
 All the characters are alphabets.
Explanation 2:
 All the characters are NOT alphabets i.e ('#', '2', '0', '2', '0').
 */
package com.March.Day39;

import java.util.ArrayList;
import java.util.Scanner;

public class Is_alpha {

    public int solve(ArrayList<Character> A) {
        int ans=1, i=0;
        while (i<A.size()) {
            if (!((A.get(i)>=65 && A.get(i)<=90) ||
                    (A.get(i)>=97 && A.get(i)<=122))) {
                ans = 0;
                break;
            }
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Character> a = new ArrayList<>();
        Is_alpha obj = new Is_alpha();
        String s = sc.nextLine();
        for (int i=0; i<s.length();i++) {
            a.add(s.charAt(i));
        }
        System.out.println(obj.solve(a));
    }
}
