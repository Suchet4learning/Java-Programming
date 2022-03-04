package com.March.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Alternating_SubArray {

    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {

        int n = A.size(), lstnum, i , j;
        char Flg = 'Y';
        B = 2 * B + 1;
        ArrayList<Integer> C = new ArrayList<>();

        for (i=0; i<=n-B; i++) {
            lstnum = A.get(i);
            if (B > 1) {
                Flg = 'Y';
                for (j=i+1; j<i+B; j++) {
                    if (A.get(j)!= lstnum) {
                        lstnum = A.get(j);
                    }
                    else {
                        Flg = 'N';
                        break;
                    }
                }
            }
            if (Flg == 'Y') {
                C.add((B+2*i)/2);
            }
        }
        return C;
    }

    public static void main(String[] args) {

        Alternating_SubArray obj = new Alternating_SubArray();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        int b = sc.nextInt();

        System.out.println(obj.solve(a,b));

    }
}
