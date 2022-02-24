package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Separate_Odd_Even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no_of_Arrays = sc.nextInt();
        int no_of_elements;
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> Odd = new ArrayList<>();
        ArrayList<Integer> Even = new ArrayList<>();

        for (int i=0; i<no_of_Arrays; i++) {

            no_of_elements = sc.nextInt();
            A.clear(); Even.clear(); Odd.clear();

            for (int j=0; j<no_of_elements; j++) {
                A.add(sc.nextInt());
                if (A.get(j) % 2 == 0) {
                    Even.add(A.get(j));
                } else {
                    Odd.add(A.get(j));
                }
            }
            for (int k :Odd) System.out.print(k + " ");
            System.out.println();
            for (int k: Even) System.out.print(k + " ");
        }
    }
}
