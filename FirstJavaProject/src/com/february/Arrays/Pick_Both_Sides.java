package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Pick_Both_Sides {

    public int solve(ArrayList<Integer> A, int B) {

        int n = A.size()-1, x=B-1, y=0;

        for (int i=1; i<A.size(); i++)
            A.set(i, A.get(i-1)+A.get(i));

        int max = A.get(x);

        if (n % x !=0) {
            if ((A.get(n) - A.get(n - x - 1)) > max)
                max = A.get(n) - A.get(n - x - 1);
        }
        //System.out.println(A.get(n) - A.get(n-x-1));

        while (x>0) {
            if (A.get(y) + A.get(n) - A.get(n - x) > max) {
                max = A.get(y) + A.get(n) - A.get(n - x);
                //System.out.println(max);
            }
            /*System.out.println("Y: " + y + ", X: " + x + ", A.get(n): " + A.get(n) + ", A.get(n-x): " +
                    A.get(n - x) + ", A.get(y): " + A.get(y));
            System.out.println(A.get(y) + A.get(n) - A.get(n - x));*/
            x--; y++;
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt(), b;
        ArrayList<Integer> a = new ArrayList<>();
        Pick_Both_Sides obj = new Pick_Both_Sides();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        b = sc.nextInt();
        System.out.println(obj.solve(a,b));
    }
}
