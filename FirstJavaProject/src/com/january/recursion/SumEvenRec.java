package com.january.recursion;

import java.util.Scanner;

public class SumEvenRec {
    public static int Sums(int A) {
        if(A==0||A==1) return 0;
        if ((A%2) != 0) A -= 1;
        return (A + Sums(A-2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Sums(n));
    }
}
