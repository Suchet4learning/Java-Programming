package com.february.exercises;

import java.util.Scanner;

public class Byes {

    public int solve(int A, int B) {

        int bye=-1, i, j=A, n;
        n = (int) (Math.log(A) / Math.log(2));

        if (B > n) {
            j = (int) Math.pow(2,B);
        }

        while (bye != B) {
            bye = 0; i=j;
            while (i > 1) {
                if (i % 2 != 0) {
                    bye++;
                }
                if (bye > B) break;
                i = (i + 1) / 2;
            }
            j++;
        }
        return j-1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k= sc.nextInt();
        Byes obj = new Byes();
        System.out.println(obj.solve(n,k));
    }
}
