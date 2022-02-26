package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Product_array {

    public ArrayList<Integer> solve(ArrayList<Integer> A) {

        ArrayList<Integer> res = new ArrayList<>();
        int prod = 1, ans = 0;

        for (int j=0; j<A.size(); j++) {
            prod = A.get(j) * prod;
        }

        for (int i=0; i<A.size(); i++) {
            res.add(prod/A.get(i));
        }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Product_array obj = new Product_array();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.solve(a));

    }
}
