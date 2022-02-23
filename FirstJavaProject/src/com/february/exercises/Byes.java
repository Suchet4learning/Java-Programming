package com.february.exercises;

import java.util.Scanner;

public class Byes {

    public int solve(int A, int B) {
        int bye=-1, i, j=A;
        while (bye != B) {
            bye = 0; i=j;
            while (i > 1) {
                if (i % 2 != 0) {
                    bye++;
                    //System.out.println(bye);
                }
                if (bye > B) break;
                i = (i + 1) / 2;
                //System.out.println(i);
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
