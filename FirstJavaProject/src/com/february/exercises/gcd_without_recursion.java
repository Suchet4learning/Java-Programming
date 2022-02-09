package com.february.exercises;

import java.util.Scanner;

public class gcd_without_recursion {

    public static int gcd(int Dividend, int Divisor) {

        int Rem = Dividend % Divisor;
        while(Rem > 0) {
            Dividend = Divisor;
            Divisor = Rem;
            Rem = Dividend % Divisor;
        }
        return Divisor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Divisor = sc.nextInt();
        int Dividend = sc.nextInt();
        if (Divisor == 0) {
            Divisor = Dividend;
            Dividend = 0;
        }
        System.out.println(gcd(Dividend,Divisor));
    }
}
