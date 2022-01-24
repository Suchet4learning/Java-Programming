package com.january;

import java.util.Scanner;

public class MagicNum {
    static int square(int A, int B) {
        if (A==1) return B;
        return ((B * square(A-1, B)));
    }

    static void power(int n) {
        int n2 = 5;
        for (int i = 1; i <= n; i = i++) {
            System.out.println(square(i, n2));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        power(n);
    }
}
