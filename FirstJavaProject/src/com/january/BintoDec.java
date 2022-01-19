package com.january;

import java.util.Scanner;

public class BintoDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long BiNum = sc.nextLong();
        int Rem, weight = 1;
        int result = 0;

        while (BiNum !=0)
        {
            Rem = (int) (BiNum % 10);
            result = result + Rem * weight;
            BiNum = BiNum / 10;
            weight = weight * 2;
        }
        System.out.println(result);
    }
}
