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

public class AddBin_String {

    public String addBinary(String A, String B) {
        int nA, nB;
        char[] res;
        int i, j, k;
        nA = A.length();
        nB = B.length();
        res = new char[Math.max(nA, nB) + 1];
        k = Math.max(nA, nB);
        i = nA - 1;
        j = nB - 1;
        int sum, carry = 0;
        while (i >= 0 || j >= 0 || carry != 0) {
            sum = carry;
            if (i >= 0)
                sum += (A.charAt(i) - '0');
            if (j >= 0)
                sum += (B.charAt(j) - '0');
            res[k] = (char) ((sum % 2) + '0');
            carry = sum / 2;
            i--;
            j--;
            k--;
        }
        if (res[0] == '1')
            return new String(res);
        int len = Math.max(nA, nB);
        return new String(res, 1, len);
    }

    public static void main(String[] args) {

        AddBin_String obj = new AddBin_String();

        Scanner sc= new Scanner(System.in);

        String S1 = sc.next();
        String S2 = sc.next();

        System.out.println(obj.addBinary(S1,S2));

    }
}
