package com.january.recursion;

import java.util.Scanner;

public class LCM {
    static int gcd( int A, int B) {
        if (A==0) return B;
        return (gcd(B % A, A));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        long P;
        P = (long) N1 * N2;
        System.out.println((P / gcd(N1,N2)));
    }
}
