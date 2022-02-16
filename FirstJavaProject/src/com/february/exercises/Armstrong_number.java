package com.february.exercises;

import java.util.Scanner;

public class Armstrong_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dig, rem, sum, n = sc.nextInt();
        int [] A = {0,1,8,27,64,125,216,363,512,729};
        for (int i=1; i<=n; i++) {
            dig = i; sum = 0;
            while (dig > 0) {
                rem = (dig % 10);
                sum = sum + (rem * rem * rem);
                dig = dig / 10;
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}
