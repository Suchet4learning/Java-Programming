package com.january.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstmissInt {

    static int missint(ArrayList<Integer> A) {
        int[] arr = new int[A.size()];
        int i = 0;

        while (i<A.size()) {
            if (A.get(i) > 0) {
                if (A.get(i) <= A.size()) {
                    arr[A.get(i)-1] = A.get(i);
                }
            }
            i++;
        }
        i = 0;
        while (i < arr.length) {
            if (arr[i] == 0) {
                if (i==0) i++;
                break;
            }
            i++;
        }
        return (arr[i-1]+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
         for (int i=0; i<num; i++) {
             A.add(sc.nextInt());
         }
         System.out.println(missint(A));
    }
}
