package com.february.exercises;

import java.util.Scanner;

public class Perfect_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum, n, count = sc.nextInt();

        for (int j = 0; j < count; j++) {

            n = sc.nextInt(); sum = 1;

            for (int i = 2; i * i <= n; i++) {

                if (n % i == 0) {

                    if (i * i == n) {
                        sum = sum + i;
                    } else {
                        sum = sum + i + (n / i);
                    }

                }

            }

            if (sum == n) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }

    }
}
