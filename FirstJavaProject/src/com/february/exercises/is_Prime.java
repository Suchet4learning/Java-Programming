package com.february.exercises;

import java.util.Scanner;

public class is_Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char Prime_Flag ='Y';

        for (int i=2; i*i<=num; i++) {
            if (num % i ==0) {
                Prime_Flag = 'N';
                break;
            }
        }

        if (Prime_Flag == 'N') {
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }
}
