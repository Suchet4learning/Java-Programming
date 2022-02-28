package com.february.Arrays;

import java.util.Scanner;

public class Amazing_Subarrays {

    public int solve(String A) {

        int ans = 0;
        A = A.toUpperCase();

        for (int i=0; i<A.length(); i++) {
            if ((A.charAt(i) == 'A') ||
                    (A.charAt(i) == 'E') ||
                    (A.charAt(i) == 'I') ||
                    (A.charAt(i) == 'O') ||
                    (A.charAt(i) == 'U')) {
                ans = ans + A.length() - i;
                ans = ans % 10003;
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Amazing_Subarrays obj = new Amazing_Subarrays();
        System.out.println(obj.solve(S));

    }
}
