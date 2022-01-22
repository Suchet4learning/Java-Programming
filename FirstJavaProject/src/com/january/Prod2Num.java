package com.january;

import java.util.Scanner;

public class Prod2Num {
    public static int Product(int A, int B){
        if (B==0) return 0;
        return (A + Product(A, B-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println("Product of 2 Numbers: " + A*B);
        System.out.println("Using Recursion: " + Product(A,B));
    }
}
