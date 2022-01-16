package com.Miscellaneous;

import java.util.Scanner;

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int i = 1;

        while(i<=Num) {
            if ((i % 2) == 0) {
                System.out.print(i + " ");
            }
            i += 1;
        }
    }
}
