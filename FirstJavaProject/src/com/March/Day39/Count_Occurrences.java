/*
Problem Description
Find number of occurrences of bob in the string A consisting of lowercase english alphabets.

Problem Constraints
1 <= |A| <= 1000

Input Format
The first and only argument contains the string A consisting of lowercase english alphabets.

Output Format
Return an integer containing the answer.

Example Input
Input 1:
  "abobc"
Input 2:
  "bobob"

Example Output
Output 1:
  1
Output 2:
  2

Example Explanation
Explanation 1:
  The only occurrence is at second position.
Explanation 2:
  Bob occurs at first and third position.
 */
package com.March.Day39;

import java.util.Scanner;

public class Count_Occurrences {

    public int solve(String A) {
        int n = A.length(), count=0;
        for (int i=0; i<n; i++) {
            if(i<n-1 && i>0) {
                if (A.charAt(i) == 'o') {
                    if (A.charAt(i-1)=='b' && A.charAt(i+1)=='b') {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Count_Occurrences obj = new Count_Occurrences();
        System.out.println(obj.solve(s));
    }
}
