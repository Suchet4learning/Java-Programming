package com.january.recursion;

import java.util.Scanner;

public class Fibonacci {
    public static int Recursive(int n) {
        if (n==0) return 0;
        else if (n==1) return 1;
        return ((Recursive(n-1)) + (Recursive(n-2)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Recursive(n));
    }
}
