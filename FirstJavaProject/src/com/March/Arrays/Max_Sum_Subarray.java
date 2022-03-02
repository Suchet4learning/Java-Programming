package com.March.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Max_Sum_Subarray {

    public int maxSubArray(ArrayList<Integer> A) {

        int sum, max = Integer.MIN_VALUE;

        for (int i=0; i<A.size(); i++) {
            for (int j=i; j<A.size(); j++) {
                sum = 0;
                for (int k=i; k<=j; k++) {
                    sum = sum + A.get(k);
                }
                if (sum > max) max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Max_Sum_Subarray obj = new Max_Sum_Subarray();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(obj.maxSubArray(a));
    }
}
