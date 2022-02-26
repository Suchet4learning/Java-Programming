package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Second_Largest {

    public int solve (ArrayList<Integer> a) {

        int Max = Integer.MIN_VALUE;
        int Max2 = Integer.MIN_VALUE;

        for (int i: a) {
            if (i >= Max) {
                Max2 = Max;
                Max = i;
            }
            else if (i > Max2) {
                Max2 = i;
            }
        }
        if (a.size() <= 1) return -1;
        return Max2;
    }


    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Second_Largest obj = new Second_Largest();

        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }

        System.out.println(obj.solve(A));
    }
}
