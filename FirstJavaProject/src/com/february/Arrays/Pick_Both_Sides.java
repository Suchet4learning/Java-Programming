package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Pick_Both_Sides {

    public int solve(ArrayList<Integer> a, int b) {

        for (int i=1; i<a.size(); i++) {
            a.set(i, a.get(i-1)+a.get(i));
        }

        int max = a.get(b-1);
        if (a.get((a.size()-1)-(b-1)) > max) {
            max = a.get((a.size() - 1) - (b - 1));
        }
        return 1;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt(), B;
        ArrayList<Integer> A = new ArrayList<>();
        Pick_Both_Sides obj = new Pick_Both_Sides();

        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }

        B = sc.nextInt();
        System.out.println(obj.solve(A,B));
    }
}
