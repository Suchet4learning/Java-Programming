package com.March.Day30;

import java.util.ArrayList;
import java.util.Scanner;

public class Matrix_Scaler_Product {

    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A, int B) {

        for (int i=0; i<A.size(); i++){
            for (int j=0; j<A.get(i).size(); j++) {
               int temp = A.get(i).get(j) * B;
               A.get(i).set(j,temp);
            }
        }
        return A;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        ArrayList<ArrayList<Integer>> a = new ArrayList<>();
        Matrix_Scaler_Product obj = new Matrix_Scaler_Product();

        for (int i=0; i<r; i++) {
            a.add(new ArrayList<>());
            for (int j=0; j<c; j++) {
                a.get(i).add(sc.nextInt());
            }
        }
        int b = sc.nextInt();
        System.out.println(obj.solve(a,b));
    }

}
