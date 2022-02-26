package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Time_to_equality {

    public int solve(ArrayList<Integer> A) {

        int ans, max = A.get(0);

        for (int i=1; i<A.size(); i++) {

            if (A.get(i) > max) {
                max = A.get(i);
            }
            A.set(i, (A.get(i) + A.get(i-1)));
        }

        ans = (A.size() * max) - A.get(A.size()-1);
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Time_to_equality obj = new Time_to_equality();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(obj.solve(a));
    }
}
