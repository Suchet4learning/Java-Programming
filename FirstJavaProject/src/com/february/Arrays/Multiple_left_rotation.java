package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiple_left_rotation {

    public ArrayList<ArrayList<Integer>> solve (ArrayList<Integer> A, ArrayList<Integer> B) {

        ArrayList<Integer> N = new ArrayList<>();
        ArrayList<ArrayList<Integer>> C = new ArrayList<>();
        int start, end, sub;

        for (int i = 0; i<B.size(); i++) {

            N.clear(); start =0;
            for (int s:A){
                N.add(s);
            }

            sub = (B.get(i) % N.size());
            end = N.size()-1;
            N = reverse(N, start, end);
            end = end - sub;
            N = reverse(N, start, end);
            start = N.size() - sub; end = N.size()-1;
            N = reverse(N, start, end);
            C.add(new ArrayList<>());
            for (int x : N) {
                C.get(i).add(x);
            }
        }

        return C;

    }

    public ArrayList<Integer> reverse(ArrayList<Integer> K, int s, int e ) {

        int m = e, temp;
        for (int j=s; j<((s+e)+1)/2; j++,m--) {
            temp = K.get(j);
            K.set(j,K.get(m));
            K.set(m,temp);
        }
        return K;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();

        Multiple_left_rotation obj = new Multiple_left_rotation();

        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }

        n = sc.nextInt();

        for (int i=0; i<n; i++) {
            B.add(sc.nextInt());
        }

        System.out.println(obj.solve(A,B));

    }

}
