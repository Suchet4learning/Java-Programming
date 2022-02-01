package com.january.arrays;

import java.util.Scanner;

public class ArraySwap {

    public int kthsmallest(final int[] A, int B) {

        int temp, j, i, small, count = 0;

        for (i=0; i<A.length; i++) {
            small = A[i]; temp = -1;
            for (j=i+1; j<A.length; j++) {
                if (small > A[j]) {
                    small = A[j];
                    temp = j;
                }
            }
            if (temp >0) {
                A[temp] = A[i];
                A[i] = small;
                count = count + 1;
            }
        }
        for (int n : A) System.out.print(n + " ");
        System.out.println('\n' + " count is: " + count);
        return A[B-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArraySwap obj = new ArraySwap();
        int n = sc.nextInt();
        int [] A = new int[n];

        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }
        int arg = sc.nextInt();

        System.out.println(obj.kthsmallest(A,arg) + " ");
    }
}
