package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Minimum_picks {

    public int solve (ArrayList<Integer> A) {

        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;

        for (int i: A) {

            if (i % 2 == 0) {
                if (i > Max) {
                    Max = i;
                }
            } else {
                if (i < Min) {
                    Min = i;
                }
            }
        }
        return (Max - Min);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for (int i=0; i<n; i++) {
            A.add(scanner.nextInt());
        }

        Minimum_picks obj = new Minimum_picks();
        System.out.println(obj.solve(A));

    }
}
