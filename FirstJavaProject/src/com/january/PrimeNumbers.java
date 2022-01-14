package com.january;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner ReadUserInput = new Scanner(System.in);
        int TestNum = ReadUserInput.nextInt();
        int factor = 2;
        do {
            if (TestNum % factor !=0) {
                factor += 1;
            }
            else {
                System.out.println("NO");
                return;
            }
        } while ((factor * factor) <= TestNum);
        if (TestNum  > 1) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
