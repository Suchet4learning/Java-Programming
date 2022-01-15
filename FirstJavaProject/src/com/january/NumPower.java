package com.january;

import java.util.Scanner;
import java.lang.Math;

public class NumPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        //double result = 0d;
        int Result = 1;

    /*    result = Math.pow(A,B);
        System.out.println((int)result); */

        while (B > 0) {
            Result = Result * A;
            B -= 1;
        }
        System.out.println(Result);
    }
}
