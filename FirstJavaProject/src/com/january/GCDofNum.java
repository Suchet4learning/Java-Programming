package com.january;

import java.util.Scanner;

public class GCDofNum {
    public int gcd(int A, int B) {
        if (A == 0) {
            return  B;
        }
        else {
             return gcd(B%A, A);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        GCDofNum Solve = new GCDofNum();
        System.out.println(Solve.gcd(a,b));
    }
}
