package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class read_books {

    public int solve(ArrayList<Integer> A) {

        int pos = 200000;
        for (int i=0; i<A.size(); i++) {
            if (A.lastIndexOf(A.get(i)) < pos) {
                pos = A.lastIndexOf(A.get(i));
            }
            if (i == pos) {
                break;
            }
        }
        return A.get(pos);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        read_books obj = new read_books();

        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }

        System.out.println(obj.solve(A));
    }
}
