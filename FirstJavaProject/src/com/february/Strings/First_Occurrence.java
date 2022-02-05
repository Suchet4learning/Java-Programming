package com.february.Strings;

import java.util.Scanner;

public class First_Occurrence {

    public int solve(String A, String B) {
        int BLen, ans = -1, BStr = 0;
        BLen = B.length();

        while (BLen <= A.length()) {

            if (B.equals(A.substring(BStr,BLen))) {
                ans = BStr + 1;
                break;
            }

            BStr++;
            BLen++;
        }
        return ans;
    }

    public static void main(String[] args) {
        First_Occurrence obj = new First_Occurrence();
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(obj.solve(A,B));
    }
}
