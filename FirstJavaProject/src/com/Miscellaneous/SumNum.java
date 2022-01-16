package com.Miscellaneous;

import java.util.Scanner;

public class SumNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        int Sum = 0;
        for (int i=1; i<=Num; i++) {
            Sum = (Sum + i);
        }
        System.out.println(Sum);
    }
}
