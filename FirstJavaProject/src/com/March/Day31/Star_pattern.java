/*
Problem Description
Write a program to input an integer N from user and print hollow diamond star pattern series of N lines.
See example for clarifications over the pattern.

Problem Constraints
1 <= N <= 1000

Input Format
First line is an integer N

Output Format
N lines containing only char '*' as per the question.

Example Input
Input 1:
4
Input 2:
6

Example Output
Output 1:
********
***  ***
**    **
*      *
*      *
**    **
***  ***
********
Output 2:

************
*****  *****
****    ****
***      ***
**        **
*          *
*          *
**        **
***      ***
****    ****
*****  *****
************
 */

package com.March.Day31;

import java.util.Scanner;

public class Star_pattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), count = 0;

        for (int i=1; i<=n*2; i++){
            for (int j=1; j<=n*2; j++) {
                if (j > (n-count/2) && j <= (n+count/2)) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
            if (i < n) {
                count = count + 2;
            }
            else if (i>n) {
                count = count - 2;
            }
        }
    }
}
