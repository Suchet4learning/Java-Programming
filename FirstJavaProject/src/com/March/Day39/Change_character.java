/*
Problem Description
Given a string A of size N consisting of lowercase alphabets.
You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.
Find the minimum number of distinct characters in the resulting string.

Problem Constraints
1 <= N <= 100000
0 <= B < N

Input Format
First argument is a string A.
Second argument is an integer B.

Output Format
Return an integer denoting the minimum number of distinct characters in the string.

Example Input
A = "abcabbccd"
B = 3

Example Output
2

Example Explanation
We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".
So the minimum number of distinct character will be 2.
 */
package com.March.Day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Change_character {

    public int solve(String A, int B) {
        int[] count = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
        int j = 0;
        for (int i=0; i<A.length(); i++) {
            count[(A.charAt(i)-'a')]++;
        }
        Arrays.sort(count);
        if (B==0) {
            while (j < 26 && count[j]==0) {
                j++;
            }
        }
        else {
            while (B > 0 && j < 26) {
                B -= count[j];
                j++;
            }
        }
        if (B < 0) j--;
        return count.length-j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        Change_character obj = new Change_character();
        System.out.println(obj.solve(s,n));
    }
}
