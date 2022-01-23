package com.january.recursion;

import java.util.Scanner;

public class HCF {
    static int gcd(int A, int B) {
        if (A==0) return B;
        return (gcd(B%A, A));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int n1, n2;

        for(int i=0; i<count; i++){
            n1 = sc.nextInt();
            n2 = sc.nextInt();
            System.out.println(gcd(n1, n2));
        }
    }
}
