package com.february.exercises;

import java.util.Scanner;

public class Is_It_Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char is_Prime = 'Y';

        for (int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                is_Prime = 'N';
                break;
            }
        }
        if ((is_Prime == 'Y') && (n > 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
