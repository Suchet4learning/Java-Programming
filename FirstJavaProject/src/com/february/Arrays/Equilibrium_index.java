package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Equilibrium_index {

    public int solve(ArrayList<Integer> a) {

        int eq = 0, sum_l, sum_r;

        while (eq < a.size()) {

            sum_l = 0; sum_r = 0;
            for (int i = 0; i < a.size(); i++) {
                if (i < eq) {
                    sum_l = sum_l + a.get(i);
                }
                if (i > eq) {
                    sum_r = sum_r + a.get(i);
                }
            }
            if (sum_l == sum_r) return eq;
            eq++;
        }
        return eq=-1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Equilibrium_index obj = new Equilibrium_index();

        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }

        System.out.println(obj.solve(A));
    }
}
