package com.Miscellaneous;

import com.february.Arrays.RotateMatrix;

import java.util.Scanner;

public class MatRotate {

    public static void rotate90(int[][] B) {

        int temp, i=0, j=0;

        while (i<B.length-1) {
            while(j<B[i].length) {
                temp = B[j][i];
                B[j][i] = B[i][j];
                B[i][j] = temp;
                j = j +1;
            }
            i=i+1;
            j=i;
        }

        for (i=0; i<B.length;i++) {
            for (j=0; j<B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int row = B.length - 1;
         for (j=0;j<B.length/2;j++) {
             for (i =0;i<B.length;i++) {
                 temp = B[i][j];
                 B[i][j] = B[i][row];
                 B[i][row] = temp;
             }
             row=row-1;
         }

        for (i=0; i<B.length;i++) {
            for (j=0; j<B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RotateMatrix obj = new RotateMatrix();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] A = new int[n][n];

        for (int i =0; i<n; i++) {
            for (int j=0; j<n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        for (int i=0; i<A.length;i++) {
            for (int j=0; j<A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        rotate90(A);
    }
}
