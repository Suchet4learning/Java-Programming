package com.february.Arrays;

import java.util.Scanner;

public class reverse_array {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), temp = 0;
        int [] A = new int[n];

        for (int i=0; i<A.length; i++) {
            A[n-1-i] = sc.nextInt();
        }

        for (int i : A) {
            System.out.print(i + " ");
        }
    }
}
