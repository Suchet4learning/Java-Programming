package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Good_pair {

    public int solve (ArrayList<Integer> A, int B) {

        for (int i=0; i<A.size(); i++) {
            for (int j = i+1; j < A.size(); j++) {
                if (A.get(i) + A.get(j) == B) {
                    return 1;
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Good_pair obj = new Good_pair();
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for (int i = 0; i<n; i++) {
            A.add(sc.nextInt());
        }

        int B = sc.nextInt();
        System.out.println(obj.solve(A, B));


    }
}
