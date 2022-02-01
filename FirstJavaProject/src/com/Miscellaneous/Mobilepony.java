package com.Miscellaneous;

import java.util.ArrayList;
import java.util.Scanner;

public class Mobilepony {

    public ArrayList<Integer> solve (ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList<Integer> C = new ArrayList<>();
        for (int i : B) {
            int s = 0, e = A.size()-1, mid;
            mid= s + ((e-s)/2);

            while (s <= e) {

                if (A.get(mid) > i) {
                    e = mid - 1;
                }
                else if (A.get(mid) < i) {
                    s = mid + 1;
                }
                else {
                    s = mid + 1;
                }
                mid= s + ((e-s)/2);
            }
            C.add(mid);
        }
        return C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobilepony obj = new Mobilepony();
        int n = sc.nextInt(), sum = 0;
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> N;

        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }
        for (int i=0; i<n; i++) {
            sum = sum + A.get(i);
            A.set(i, sum);
        }
        for (int i : A) {
            System.out.print(i + " ");
        }
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            B.add(sc.nextInt());
        }
        N = obj.solve(A,B);
        for (int i : N) {
            System.out.print(i + " ");
        }

    }
}
