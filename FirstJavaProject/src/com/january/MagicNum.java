package com.january;

import java.util.Scanner;

public class MagicNum {
    public static int Decbin(int n) {
        if (n==0) return 0;
        return ((Decbin(n/2) * 5 + (n%2) * 5));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Decbin(n));
    }
}
