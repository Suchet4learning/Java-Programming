package com.january.recursion;

import java.util.Scanner;

public class digitsumrecursion {

    public static int numadd(int A) {
        if (A == 0) return 0;
        return((A % 10) + numadd(A / 10));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            System.out.println(numadd(sc.nextInt()));
        }
    }
}
