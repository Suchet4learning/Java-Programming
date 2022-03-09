package com.March.Day31;

import java.util.ArrayList;
import java.util.Scanner;

public class Christmas_tree_better {

    public int solve(ArrayList<Integer>A, ArrayList<Integer> B){

        int ans=0;

        return ans;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        Christmas_tree_better obj = new Christmas_tree_better();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        n= sc.nextInt();

        for (int i=0; i<n; i++) {
            b.add(sc.nextInt());
        }

        System.out.println(obj.solve(a,b));

    }
}
