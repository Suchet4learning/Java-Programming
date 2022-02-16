package com.february.exercises;

import java.util.Scanner;

public class Sq_root {
    public int solve(int A) {
        for (int i=1;i*i<=A;i++) {
            if (i*i==A) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sq_root obj = new Sq_root();
        System.out.println(obj.solve(n));
    }
}
