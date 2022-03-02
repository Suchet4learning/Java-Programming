/*
Problem Description
Given an array A of N non-negative numbers and you are also given non-negative number B.
You need to find the number of subarrays in A having sum less than B. We may assume that there is no overflow.

        Problem Constraints
        1 <= N <= 103
        1 <= A[i] <= 1000
        1 <= B <= 107

        Input Format
        First argument is an integer array A.
        Second argument is an integer B.

        Output Format
        Return an integer denoting the number of subarrays in A having sum less than B. */

package com.March.Arrays;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Counting_subarrays {

    public int solve(ArrayList<Integer> A, int B) {

        int sum, max = 0;

        for (int i = 1; i < A.size(); i++) {
            A.set(i, A.get(i) + A.get(i - 1));
        }

        for (int i = 0; i < A.size(); i++) {
            for (int j = i; j < A.size(); j++) {
                if (i > 0)
                    sum = A.get(j) - A.get(i - 1);
                else
                    sum = A.get(j);

                if  (sum < B) max++;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss.SSS");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Counting_subarrays obj = new Counting_subarrays();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        int b = sc.nextInt();

        //Date dt = new Date();
        //System.out.println(fmt.format(dt));

        System.out.println(obj.solve(a,b));

        //dt = new Date();
        //System.out.println(fmt.format(dt));
    }
}
