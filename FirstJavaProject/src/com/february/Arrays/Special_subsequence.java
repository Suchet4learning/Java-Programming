package com.february.Arrays;

import java.util.Scanner;

public class Special_subsequence {

    public int solve(String A) {

        int cnt = 0, ans =0;

        for (int i=A.length()-1; i>=0; i--) {

            if (A.charAt(i) == 'G') {
                cnt++;
            }

            if (A.charAt(i) == 'A') {
                ans = (ans % (int)(Math.pow(10,9))) + cnt;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Special_subsequence obj = new Special_subsequence();
        System.out.println(obj.solve(S));

    }
}
