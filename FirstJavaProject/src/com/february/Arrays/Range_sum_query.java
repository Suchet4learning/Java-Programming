package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Range_sum_query {

    public ArrayList<Long> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Long> C = new ArrayList<>();
        ArrayList<Long> D = new ArrayList<>();

        D.add(Long.valueOf(A.get(0)));
        for (int i=1; i<A.size();i++) {
            D.add((D.get(i-1)+A.get(i)));
        }

        for (int i=0; i<B.size(); i++) {
            for (int j =0; j<B.get(i).size(); j=j+2) {
                if (B.get(i).get(j) <= 1) {
                    C.add(D.get((B.get(i).get(j+1))-1));
                }
                else {
                    C.add(D.get((B.get(i).get(j+1))-1)-(D.get((B.get(i).get(j))-2)));
                }
            }
        }
        return C;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<ArrayList<Integer>> b = new ArrayList<>();
        Range_sum_query obj = new Range_sum_query();

        for (int i= 0; i<n; i++) {
            a.add(sc.nextInt());
        }

        int R = sc.nextInt();
        int C = sc.nextInt();

        for (int i=0; i<R; i++) {
            b.add(new ArrayList<>());
            for (int j=0; j<C; j++) {
                b.get(i).add(sc.nextInt());
            }
        }

        System.out.println(obj.solve(a,b));
    }
}
