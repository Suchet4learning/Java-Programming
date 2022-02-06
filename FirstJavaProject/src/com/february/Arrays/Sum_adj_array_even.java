package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_adj_array_even {

    public int solve(ArrayList<Integer> A) {
        int count, odd = 0, Even = 0;

        for (int i=0; i<A.size(); i++) {
            if (A.get(i) % 2 == 0) {
                Even++;
            } else {
                odd++;
            }
        }

        if (Even > odd) {
            count = odd;
        } else {
            count = Even;
        }
        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        int n = sc.nextInt();

        Sum_adj_array_even obj = new Sum_adj_array_even();

        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }

        System.out.println(obj.solve(A));
    }
}
