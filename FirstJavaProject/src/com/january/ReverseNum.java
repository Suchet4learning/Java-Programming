package com.january;

import java.util.Scanner;
import java.lang.Math;


public class ReverseNum {
    public static void main(String[] args) {
        Scanner UsrInp = new Scanner(System.in);
        int Var = UsrInp.nextInt();
        int num;
        int[] Count = {0,0,0,0,0,0,0,0,0,0};
        int i = 0;
        int j;
        double result = 0d;

        for (int n=0; n < Var; n++) {
            num = UsrInp.nextInt();
            while (num > 0) {
                Count[i] = num % 10;
                i += 1;
                num = num / 10;
            }
            i -= 1;
            j = 0;
            while ((i-j) >= 0) {
                result = result + (Count[j]) * (Math.pow(10, i-j));
                j += 1;
            }
            System.out.println((int)result);
            result = 0d;
            i = 0;
        }
    }
}

