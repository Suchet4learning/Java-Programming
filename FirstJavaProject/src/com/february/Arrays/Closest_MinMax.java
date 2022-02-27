package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Closest_MinMax {

    public int solve(ArrayList<Integer> A) {

        int ans= A.size(), max=Integer.MIN_VALUE, min =Integer.MAX_VALUE;
        int max_count=-1, min_count=-1;

        for (int i=0; i<A.size(); i++) {
            if (A.get(i)>max) max = A.get(i);
            if (A.get(i)<min) min = A.get(i);
        }

        if (max == min) return 1;

        for (int i=0; i<A.size(); i++) {

            if (A.get(i)==max){
                max_count = i;
            }

            if (A.get(i)==min) {
                min_count = i;
            }

            if ((max_count >= 0) && (min_count >= 0)) {
                    if (Math.abs(min_count - max_count) < ans)
                        ans = Math.abs(min_count - max_count) + 1;
            }
        }

        return ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Closest_MinMax obj = new Closest_MinMax();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.solve(a));

    }
}
