package com.february.exercises;

import java.rmi.Remote;
import java.util.Scanner;

public class Byes_quick {

    public int solve(int A, int B) {

        int i = 1, ans = 0, Rem;
        Rem = B;
        int n = (int)(Math.log(A)/Math.log(2));

        while ((Rem >= 0) && (ans < n)) {

            i = i * 2;

            if ((Rem > 0) && ((ans % 2) == 0)|| (ans == n)) {
                i = i + 1;
                Rem--;
            }

            ans ++;
        }
        return i;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), k= sc.nextInt();
        Byes_quick obj = new Byes_quick();
        System.out.println(obj.solve(n,k));
    }
}
