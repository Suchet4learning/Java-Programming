package com.March.Miscellaneous;

import java.util.ArrayList;
import java.util.Scanner;

public class Roses_in_a_shop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
    }
}
