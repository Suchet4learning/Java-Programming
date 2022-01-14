package com.january;

import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        Scanner RdUsrInp = new Scanner(System.in);
        int Num = RdUsrInp.nextInt();
        int count = 1;
        int NbrSum = 0;

        for (int i=0; i<Num; i++) {
            if (count % 2 == 0) {
                NbrSum += count;
            }
            count += 1;
        }
        System.out.println(NbrSum);
    }
}
