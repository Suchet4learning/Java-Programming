package com.january;

import java.util.Scanner;

public class PrimeEasy {
    public static void main(String[] args) {
        Scanner ReadInp = new Scanner(System.in);
        int n = ReadInp.nextInt();
        for (int i = 2; i <= n; i++)
        {
            int notPrime = 0;

            //checkForPrimes
            for (int j = 2; j <= i - 1; j++)
            {
                if (i % j != 0) {
                   continue;
                }
                else
                {
                    notPrime = 1;
                    break;
                }
            }
            if (notPrime == 0) {
                System.out.println(i);
            }
        }
    }
}
