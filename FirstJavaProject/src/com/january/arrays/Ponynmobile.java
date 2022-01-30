package com.january.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Ponynmobile {
    static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        int amt, j;
        ArrayList<Integer> C = new ArrayList<>();
        for (int i=0; i<B.size();i++) {
            amt = B.get(i);
            j=0;
                while ((amt > 0) && (j < A.size())) {
                    amt = amt - A.get(j);
                    j++;
                }
                if (amt < 0) j = j-2;
                else if (amt >= 0) j--;
                C.add(j+1);
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C = new ArrayList<>();
        int n = sc.nextInt();
        for (int i = 0; i<n; i++) {
            A.add(sc.nextInt());
        }
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            B.add(sc.nextInt());
        }
        C = solve(A,B);
        System.out.println(C + " ");
    }
}
