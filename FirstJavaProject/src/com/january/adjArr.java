package com.january;

import java.util.ArrayList;
import java.util.Scanner;

public class adjArr {
    public int solve(ArrayList<Integer> A) {
        int count = 0;
        for (int i=0; i<A.size(); i++) {
            if (((A.get(i) + A.get(i+1)) % 2) != 0) {
                A.remove(i+1);
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        adjArr obj = new adjArr();
        ArrayList<Integer> A = new ArrayList<>();

        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }
        System.out.println(obj.solve(A));
    }
}
