/*
Repeat and Missing
You are given a read only array of n integers from 1 to n.
Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Note that in your output A should precede B.
 */
package com.March.Day35;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repeat_and_Missing {

    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {

        ArrayList<Integer> B = new ArrayList<>();

        int sum = 0, x;

        for (int i : A) {
            sum = sum + i;
        }

        x = ((A.size() * (A.size() + 1)) / 2) - sum;
        B.add((sum % A.size())-x);
        B.add(sum % A.size());

        return B;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        Repeat_and_Missing obj = new Repeat_and_Missing();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.repeatedNumber(a));
    }
}
