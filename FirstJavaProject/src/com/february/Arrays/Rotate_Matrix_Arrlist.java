package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Rotate_Matrix_Arrlist {

    public void solve(ArrayList<ArrayList<Integer>> A) {

        int temp; int i = 0, j;

         while (i<A.size()) {
             j = i;
            while(j<A.get(i).size()) {
                temp = A.get(j).get(i);
                A.get(j).set(i,A.get(i).get(j));
                A.get(i).set(j,temp);
                j++;
            }
            i++;
        }
         /*for (i=0; i<A.size(); i++) {
            for (j=0; j<A.get(i).size(); j++) {
                System.out.print(A.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println(); */

        i=0;
        while(i<(A.size()/2)) {
            j = 0;
             while(j<A.get(i).size()) {
                 temp=A.get(j).get(i);
                 A.get(j).set(i,A.get(j).get(A.size()-1-i));
                 A.get(j).set(A.size()-1-i, temp);
                j++;
             }
            i++;
        }
        //System.out.println(A);
        for (i=0; i<A.size(); i++) {
            for (j=0; j<A.get(i).size(); j++) {
                System.out.print(A.get(i).get(j) + " ");
            }
            System.out.println();
        }
        //System.out.println();
    }


    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> A = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Rotate_Matrix_Arrlist obj = new Rotate_Matrix_Arrlist();

        for (int i=0; i<n; i++) {
            A.add(new ArrayList<>());
            for (int j=0; j<n; j++) {
                A.get(i).add(j,sc.nextInt());
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(A.get(i).get(j) + " ");
            }
            System.out.println();
        }
        System.out.println();

        obj.solve(A);


    }
}
