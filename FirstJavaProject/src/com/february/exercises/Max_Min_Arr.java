package com.february.exercises;

import java.util.Scanner;

public class Max_Min_Arr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0, min = 1001;
        int[] Arr = new int[n];

        for (int i : Arr) {
            i = sc.nextInt();
            if (i > max) max = i;
            if (i < min) min = i;
        }
        System.out.print(max + " " + min);
    }
}
