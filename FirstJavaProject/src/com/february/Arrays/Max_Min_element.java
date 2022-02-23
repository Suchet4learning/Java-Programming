package com.february.Arrays;

import java.util.Scanner;

public class Max_Min_element {

    public static void main(String[] args) {

        // read the size of the Array and all elements of the array.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];

        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        for (int i:A) {
            i = sc.nextInt();
            if (i>Max) Max=i;
            if (i<Min) Min=i;
        }

        System.out.println(Max + " " + Min);
    }
}
