package com.january;

import java.util.Scanner;

public class PrintNto1 {
    public static void solve(int N) {
        if (N>0) {
            System.out.print(N + " ");
            solve(N-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        solve(n);
    }

}
