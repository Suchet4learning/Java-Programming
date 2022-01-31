package com.january.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InsertArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n+1];
        for (int i=0; i<A.length-1; i++) {
            A[i] = sc.nextInt();
        }
        int pos = sc.nextInt();
        int val = sc.nextInt();
        for (int j = A.length-1; j>=0; j--) {
            if (j == pos-1) {
                A[j] = val;
                break;
            }
            else {
                A[j] = A[j-1];
            }
        }
        for (int i : A)
        System.out.print(i + " ");
    }
}
