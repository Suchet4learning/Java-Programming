package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Equilibrium_index {

    public int solve(ArrayList<Integer> A) {

        int suml=0, sumr, n = A.size()-1;

        for (int i = 1; i < A.size(); i++) {
            A.set(i,(A.get(i-1) + A.get(i)));
        }

        for (int j=0; j<A.size();j++) {
             sumr = A.get(n) - A.get(j);
             if (j>0) suml = A.get(j-1);
             if (suml == sumr) return j;
        }
        return -1;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Equilibrium_index obj = new Equilibrium_index();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.solve(a));
    }
}
