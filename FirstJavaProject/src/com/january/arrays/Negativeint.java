package com.january.arrays;

import java.util.Scanner;

public class Negativeint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Arr = new int[n];

        for (int i =0; i<n; i++) {
            Arr[i] = sc.nextInt();
            if (Arr[i] < 0) {
                System.out.print(Arr[i] + " ");
            }
        }
    }
}
