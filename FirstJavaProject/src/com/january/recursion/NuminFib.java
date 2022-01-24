package com.january.recursion;

import java.util.Scanner;

public class NuminFib {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, count = sc.nextInt();
        for (int i=0; i<count; i++)
        {
            A = sc.nextInt();
            int Sum = 1, n1 = 0, n2 = 1;
            if (A == 0 || A == 1) System.out.println("Yes");
            while (Sum < A) {
                Sum = n1 + n2;
                n1 = n2;
                n2 = Sum;
                if (Sum == A) System.out.println("Yes");
                if (Sum > A) System.out.println("No");
            }
        }
    }
}
