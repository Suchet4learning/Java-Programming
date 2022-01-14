package com.january;

import java.lang.*;
import java.util.*;

public class Numpy {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++)
        {
            int spaces = n - i;

            for (int j = 1; j <= spaces; j++)
                System.out.print(0 + " ");

            int lim = 2 *i - 1;

            for (int j = i; j <= lim; j++)
            {
                System.out.print(j + " ");
            }

            for (int j = lim - 1; j >= i; j--)
            {
                System.out.print(j + " ");
            }

            for (int j = 1; j <= spaces; j++) {
                System.out.print(0 + " ");
            }
            System.out.println();
        }
    }
}