package com.february.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Compare_sorted_array {

    public ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<Integer> C = new ArrayList<>();
        ArrayList<Integer> D = new ArrayList<>();
        ArrayList<Integer> Ans = new ArrayList<>();

        int i = 0, j, l1, r1, l2, r2;
        while (i < B.size()) {
            j = 0; C.clear(); D.clear();
            l1 = B.get(i).get(j);
            r1 = B.get(i).get(j+1);
            l2 = B.get(i).get(j+2);
            r2 = B.get(i).get(j+3);
            C.addAll(A.subList(l1,r1+1));
            D.addAll(A.subList(l2,r2+1));
            Collections.sort(C);
            Collections.sort(D);

            if (C.equals(D)) {
            //if (C.size() == D.size() && C.containsAll(D)) {
                Ans.add(1);
            }
            else {
                Ans.add(0);
            }
            i++;
        }
        return Ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, row, col, n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<ArrayList<Integer>> B = new ArrayList<>();
        Compare_sorted_array obj = new Compare_sorted_array();

        for (i=0; i<n; i++) {
            A.add(sc.nextInt());
        }

        row = sc.nextInt();
        col = sc.nextInt();
        for (i=0; i<row; i++) {
            B.add(new ArrayList<>());
            for (j=0; j<col; j++) {
                B.get(i).add(j, sc.nextInt());
            }
        }

        ArrayList<Integer> Ans = obj.solve(A,B);
        System.out.println(Ans);
    }
}
