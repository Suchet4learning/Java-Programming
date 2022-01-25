package com.january;

import java.util.ArrayList;
import java.util.Scanner;

public class DecimalBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> A = new ArrayList<>();
        int n = sc.nextInt();
        int Num = 0;
        int Bin = 0, Rem = 0;
        for (int i=0; n > 0; i++) {
            A.add((n % 2));
            n = n / 2;
        }
        for (int i = A.size()-1; i>=0; i--) {
            Bin = (Bin * 10) + A.get(i);
        }
        System.out.println(Bin);
    }
}
