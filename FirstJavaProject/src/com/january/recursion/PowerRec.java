package com.january.recursion;

import java.util.Scanner;

public class PowerRec {
    public static int Power(int A, int B) {
        if (B==0) return 1;
        return(A * Power(A,B-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        System.out.println(Power(A,B));
    }
}
