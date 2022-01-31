package com.january.arrays;

import java.util.Scanner;

public class Deletenum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        int[] B = new int[n-1];
        int pos = sc.nextInt();
        for (int i=0; i<n-1; i++) {
            if (i < pos-1) {
                B[i] = A[i];
            }
            else {
                B[i] = A[i+1];
            }
        }
        for (int i : B) {
            System.out.print(i + " ");
        }
    }
}
