package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Bulbs {

    public int bulbs(ArrayList<Integer> A) {

        int ans = 0;

        for (int i=0; i<A.size();i++) {
            if (ans % 2 == 0) {
                if (A.get(i) == 0) {
                    ans++;
                }
            } else {
                if(A.get(i) == 1) {
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Bulbs obj = new Bulbs();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.bulbs(a));
    }

}
