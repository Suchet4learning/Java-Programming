package com.Miscellaneous;

import java.util.Scanner;

public class StopOnNeg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num;
        int Sum = 0;

        while(Sum >= 0) {
            Num = sc.nextInt();
            Sum = Sum + Num;
            System.out.println(Sum);
        }

    }
}
