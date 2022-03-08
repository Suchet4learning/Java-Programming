/*
Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.

Input Format
The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7
 */

package com.March.Day31;

import java.util.ArrayList;
import java.util.Scanner;

public class Length_longest_consecutive {

    public int solve(String A) {
        int ans, N1, Z1=-1, i=0, N2=-1, Z2=-1, N3=-1,l=0, max=Integer.MIN_VALUE, count=0;

        while(i<A.length()) {
            N1 = A.indexOf('1',i);
            if (N1>=0) {
                Z1 = A.indexOf('0', N1 + 1);
                if (Z1 >= 0) {
                    N2 = A.indexOf('1', Z1 + 1);
                    count = count + Z1 - N1;
                    if (N2 >= 0) {
                        Z2 = A.indexOf('0', N2 + 1);
                        if (Z2 >= 0) {
                            N3 = A.indexOf('1', Z2 + 1);
                            count = count + Z2 - N2;
                        }
                        else {
                            count = count + A.length() - N2;
                        }
                    }
                }
                else {
                    count = count + A.length() - N1;
                }
            }

            if (N1 == -1) {
                if (max > 0) return max;
                else return 0;
            }
            else if (Z1 == -1) {
                return Math.max(A.length() - N1, max);
            }
            else if (N2 == -1) {
                return Math.max(Z1 - N1, max);
            }
            else if (Z2 == -1) {
                    if (count > ((Z1-N1) + (A.length()-N2))) {
                        if (N2-Z1 > 1)
                            return Math.max(Math.max(A.length() - N2 + 1, Z1 - N1 + 1), max);
                        else
                            return Math.max(A.length() - N2 + 1 + Z1 - N1, max);
                    }
                    else {
                        if (N2-Z1 > 1)
                            return Math.max(Math.max(A.length() - N2 + 1, Z1 - N1 + 1), max);
                        else
                            return Math.max((Z1 - N1 + A.length() - N2), max);
                    }
            }
            else if (N3 == -1) {
                if (count > ((Z1-N1) + (Z2-N2))) {
                    if (N2-Z1 > 1)
                        return Math.max(Math.max(Z2 - N2 + 1, Z1 - N1 + 1), max);
                    else
                        return Math.max((Z2 - N2 + 1 + Z1 - N1), max);
                }
                else
                    if (N2-Z1 > 1)
                        return Math.max(Math.max(Z2 - N2 + 1, Z1 - N1 + 1), max);
                    else
                        return Math.max((Z2 - N2 + Z1 - N1), max);
            }
            else {
                if (N2-Z1 == 1) {
                    ans = (Z1 - N1) + 1 + (Z2 - N2);
                }
                else {
                    ans = Math.max(Z1-N1 + 1, Z2-N2 + 1);
                }
                if (ans > max) max = ans;
            }
            i = Z1+1;
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Length_longest_consecutive obj = new Length_longest_consecutive();

        System.out.println(obj.solve(S));

    }

}
