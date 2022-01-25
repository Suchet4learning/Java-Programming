package com.january;

import java.util.Scanner;

public class Solution {
    public static int solve(int A) {
        if (A==0) return 0;
        return ((solve(A/2) * 5 + (A%2) * 5));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(solve(n));
    }
}
