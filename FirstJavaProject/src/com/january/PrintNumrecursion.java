package com.january;

import java.util.Scanner;

public class PrintNumrecursion {
    public static void PrintNum(int N) {
         if (N > 1) {
             PrintNum(N-1);
         }
         System.out.print(N + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintNum(n);
    }
}
