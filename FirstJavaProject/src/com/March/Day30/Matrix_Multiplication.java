package com.March.Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix_Multiplication {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int sum, x, y;

            for (int j=0; j<A.size(); j++) {
                res.add(new ArrayList<>());
                x=0;
                while (x<B.get(0).size()) {
                    y = 0;
                    sum = 0;
                    while (y < B.size()) {
                        sum = sum + A.get(j).get(y) * B.get(y).get(x);
                        y++;
                    }
                    res.get(j).add(x, sum);
                    x++;
                }
            }
        return res;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int r= sc.nextInt();
        int c = sc.nextInt();
        ArrayList<ArrayList<Integer>> m = new ArrayList<>();
        ArrayList<ArrayList<Integer>> n = new ArrayList<>();
        Matrix_Multiplication obj = new Matrix_Multiplication();

        for (int i=0; i<r; i++) {
            m.add(new ArrayList<>());
            for (int j=0; j<c; j++) {
                m.get(i).add(sc.nextInt());
            }
        }

        r= sc.nextInt();
        c = sc.nextInt();

        for (int i=0; i<r; i++) {
            n.add(new ArrayList<>());
            for (int j=0; j<c; j++) {
                n.get(i).add(sc.nextInt());
            }
        }

        System.out.println(obj.solve(m,n));
    }
}
