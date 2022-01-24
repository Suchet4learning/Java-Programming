package com.january;

import java.util.ArrayList;
import java.util.Scanner;

public class DectoBin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Sum = 0, n = sc.nextInt();
        ArrayList<Integer> Count = new ArrayList<>();

        for (int i=0; i < n; i++) {
            Count.add(sc.nextInt());
        }

        for (int i : Count) {
            Sum = Sum + i;
        }
        System.out.println(Sum);
    }
}
