package com.january;

import java.util.Scanner;

public class Decimal2Binary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Sum = 0;
        int P = 1;

        while (Num > 0) {
            Sum = Sum + (Num % 2) * P;
            Num = Num / 2;
            P = P * 10;
        }
        System.out.println(Sum);
    }
}
