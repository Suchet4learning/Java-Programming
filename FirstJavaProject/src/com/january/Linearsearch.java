package com.january;

import java.util.ArrayList;
import java.util.Scanner;

public class Linearsearch {
    public int linearSearch(ArrayList<Integer> A, int B) {
        for (int i : A) {
            if ( i == B) return 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ArrObj = new ArrayList<>();
        Linearsearch obj = new Linearsearch();
        int Num = sc.nextInt();

        for (int i=0; i<Num; i++) {
            ArrObj.add(sc.nextInt());
        }
        Num = sc.nextInt();
        System.out.println(obj.linearSearch(ArrObj, Num));
    }
}
