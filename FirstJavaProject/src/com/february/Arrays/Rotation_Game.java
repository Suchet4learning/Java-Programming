package com.february.Arrays;

import java.util.Scanner;

public class Rotation_Game {

    public int[] reverse(int[] A, int s, int e) {

        int temp, i, j;
        for (i=s, j=e; i<(s+e+1)/2; i++,j--) {
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }

        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), start, end;
        int [] A = new int[n];
        Rotation_Game obj = new Rotation_Game();

        for (int i=0; i<n; i++) {
            A[i] = sc.nextInt();
        }

        int B = sc.nextInt();

        if (B >= A.length) {
            B = B % A.length;
        }
        if (B>0) {
            start = 0; end = A.length-1;
            A = obj.reverse(A, start, end);
            end = B-1;
            A = obj.reverse(A, start, end);
            start = B; end = A.length-1;
            A = obj.reverse(A, start, end);
        }

        for (int i: A)
        System.out.print(i + " ");

    }
}
