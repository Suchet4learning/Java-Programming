package com.february.Strings;

import java.util.Scanner;

public class Special_String {

    public String solve(String S) {
        int n, i;
        n = S.lastIndexOf('a');
        if (n == -1) return "No";
            for (i = 0; i <= n; i++) {
                if (S.charAt(i) != 'a') return "No";
            }

        n = S.indexOf('b');
        if ((n==-1) || (n==0)) return "No";
            for (int j = n; j < S.length(); j++) {
                if (S.charAt(j) != 'b') return "No";
            }

        return "Yes";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Special_String obj = new Special_String();
        System.out.println(obj.solve(S));
    }
}
