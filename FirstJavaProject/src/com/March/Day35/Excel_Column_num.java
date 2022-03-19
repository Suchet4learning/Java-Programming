/*
Problem Description
Given a column title as appears in an Excel sheet, return its corresponding column number.

Problem Constraints
1 <= length of the column title <= 5

Input Format
The only argument is a string that represents the column title in the excel sheet.

Output Format
Return a single integer that represents the corresponding column number.

Example Input
Input 1:
 AB
Input 2:
 ABCD

Example Output
Output 1:
 28
Output 2:
 19010

Example Explanation
Explanation 1:
 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */
package com.March.Day35;

import java.util.Scanner;

public class Excel_Column_num {

    public int titleToNumber(String A) {

        int ans = 0;
        for (int i=0; i<A.length(); i++){
            ans = (A.charAt(0) - 'A') + 1;
        }

        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Excel_Column_num obj = new Excel_Column_num();

        System.out.println(obj.titleToNumber(S));
    }
}
