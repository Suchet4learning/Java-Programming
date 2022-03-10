/*
Problem Description
Given two binary strings, return their sum (also a binary string).
Example:

a = "100"
b = "11"
Return a + b = "111".
 */

package com.March.Day32;

import java.util.Scanner;

public class Add_Binary_String {

    public String addBinary(String A, String B) {

        StringBuilder Result = new StringBuilder();

        int s=0, x=A.length()-1, y=B.length()-1;

        while (x>=0 || y>=0 || s==1) {
            s += ((x>=0)? A.charAt(x) -'0':0);
            s += ((y>=0)? B.charAt(y) -'0':0);

            Result.append((char)(s % 2 + '0'));
            s = s/2;
            x--;y--;
        }

        return Result.reverse().toString();
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        String S1 = sc.next();
        String S2 = sc.next();
        Add_Binary_String obj = new Add_Binary_String();

        System.out.println(obj.addBinary(S1,S2));

    }
}
