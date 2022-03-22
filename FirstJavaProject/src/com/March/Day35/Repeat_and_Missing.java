/*
Repeat and Missing
You are given a read only array of n integers from 1 to n.
Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.
Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
Note that in your output A should precede B.
 */
package com.March.Day35;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Repeat_and_Missing {

    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {

        BigInteger n = BigInteger.valueOf(A.size());

        BigInteger sum = BigInteger.valueOf(0);
        BigInteger sum_sq =BigInteger.valueOf(0);

        for(int x : A)
        {
            sum = sum.add(BigInteger.valueOf(x));
            sum_sq = sum_sq.add(BigInteger.valueOf(x).multiply(BigInteger.valueOf(x)));
        }

        BigInteger arr_s = n.multiply(n.add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(2));
        BigInteger arr_sq = arr_s.multiply(BigInteger.valueOf(2).multiply(n).add(BigInteger.valueOf(1))).divide(BigInteger.valueOf(3));

        BigInteger sub = arr_s.subtract(sum);
        BigInteger add = (arr_sq.subtract(sum_sq)).divide(sub);
        //(arr_sr-sum_sq)/sub;

        int b = sub.add(add).divide(BigInteger.valueOf(2)).intValue();
        //(sub+add)/2;

        int a = BigInteger.valueOf(b).subtract(sub).intValue();
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(a);
        ans.add(b);
        return ans;
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
