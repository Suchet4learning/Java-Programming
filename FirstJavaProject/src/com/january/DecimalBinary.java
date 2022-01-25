package com.january;

import java.util.Scanner;

public class DecimalBinary {
    public static int Decbin(int n) {
        if (n==0) return 0;
        return (Decbin(n/2) * 10 + (n %2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Decbin(n));
    }
}
