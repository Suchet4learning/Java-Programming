package com.january;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int val = sc.nextInt();
        int num = val;
        int rev = 0;

        if (num > 0) {
            while(num > 0) {
                rev = ((rev * 10) + (num % 10));
                num = num / 10;
            }
        }
        if (val == rev) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
