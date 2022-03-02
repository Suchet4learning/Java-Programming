package com.March.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Max_Sum_Subarr_opt {

    public int maxSubArray(final ArrayList<Integer> A) {

        int sum, max = Integer.MIN_VALUE;
        ArrayList<Integer> B = new ArrayList<>(A);

        for(int i=1; i<B.size();i++) {
            B.set(i,B.get(i) + B.get(i-1));
        }
        //System.out.println(A);

        for (int i=0; i<=B.size(); i++) {
            for (int j=i; j<B.size(); j++) {

                if (i>0)
                    sum = B.get(j) - B.get(i-1);
                else
                    sum = B.get(j);

                if (sum > max) max = sum;

            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Max_Sum_Subarr_opt obj = new Max_Sum_Subarr_opt();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(obj.maxSubArray(a));
    }
}
