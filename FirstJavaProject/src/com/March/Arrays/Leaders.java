package com.March.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Leaders {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> B = new ArrayList<>();
        int n = A.size()-1, ans=0;
        int max = Integer.MIN_VALUE;

        for (int i=A.size()-1; i>=0; i--) {
            if (A.get(i) > max) {
                max = A.get(i);
                B.add(max);
            }
        }
        return B;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Leaders obj = new Leaders();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.solve(a));

    }

}
