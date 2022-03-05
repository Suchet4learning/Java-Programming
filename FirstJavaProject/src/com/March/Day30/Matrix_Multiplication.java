package com.March.Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix_Multiplication {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int sum, sum1;

        for (int i=0; i<A.get(0).size(); i++) {
            res.add(new ArrayList<>()); sum = 0;
            for (int j=0; j<A.size(); j++) {
                sum = sum + A.get(i).get(j) * B.get(j).get(i); sum1= 0;
                for (int k=0; k<B.get(0).size();k++) {
                    sum1 = sum1 + A.get(j).get(k) * A.get(k).get(j);
                }
            }
            res.get(i).add(sum);
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
