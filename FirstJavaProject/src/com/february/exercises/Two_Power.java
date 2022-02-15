package com.february.exercises;

import java.util.Scanner;

public class Two_Power {
    public int power(String A) {
        int n = Integer.parseInt(A);
        int count = 0;
        if (n > 1) {
            while (n % 2 == 0) {
                n = n / 2;
            }

            if (n == 1) {
                count = 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Two_Power obj = new Two_Power();
        System.out.println(obj.power(S));
    }
}
