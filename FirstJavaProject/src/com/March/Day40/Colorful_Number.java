/*
Problem Description
Given a number A, find if it is COLORFUL number or not.
If number A is a COLORFUL number return 1 else, return 0.

What is a COLORFUL Number:
A number can be broken into different contiguous sub-subsequence parts.
Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245.
And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different.

Problem Constraints
1 <= A <= 2 * 109

Input Format
The first and only argument is an integer A.

Output Format
Return 1 if integer A is COLORFUL else return 0.

Example Input

Input 1:
 A = 23

Input 2:
 A = 236

Example Output

Output 1:
 1

Output 2:
 0


Example Explanation

Explanation 1:
 Possible Sub-sequences: [2, 3, 23] where
 2 -> 2
 3 -> 3
 23 -> 6  (product of digits)
 This number is a COLORFUL number since product of every digit of a sub-sequence are different.

Explanation 2:
 Possible Sub-sequences: [2, 3, 6, 23, 36, 236] where
 2 -> 2
 3 -> 3
 6 -> 6
 23 -> 6  (product of digits)
 36 -> 18  (product of digits)
 236 -> 36  (product of digits)
 This number is not a COLORFUL number since the product sequence 23  and sequence 6 is same.
 */
package com.March.Day40;

import java.util.HashSet;
import java.util.Scanner;

public class Colorful_Number {

    public int colorful(int A) {
        HashSet<Integer> set = new HashSet<>();
        String str = Integer.toString(A);
        for(int i=0;i<str.length();i++){
            int product = 1;
            for(int j=i; j<str.length();j++){
                int num = str.charAt(j) - '0';
                product *= num;
                if(set.contains(product)) return 0;
                set.add(product);
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Colorful_Number obj = new Colorful_Number();
        int n = sc.nextInt();
        System.out.println(obj.colorful(n));
    }
}
