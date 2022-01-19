package com.january;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i;
        char isPrime = 'Y';

        for (i=2; i<=N; i++)
        {
            for (int j=2; j*j <= i; j++)
            {
                if (i % j ==0)
                {
                    isPrime = 'N';
                    break;
                }
                else
                {
                    isPrime = 'Y';
                }
            }
                if (isPrime == 'Y')
                {
                    System.out.print(i + " ");
                }
        }
        if (N <= 1)
           {
               System.out.println("There are no prime numbers less than " + N);
           }
    }
}
