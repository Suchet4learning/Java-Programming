/*
Problem Description
        Given an array of integers A.
        A subarray of an array is said to be good if it fulfils any one of the criteria:
        1. Length of the subarray must be even and the sum of all the elements of the subarray must be less than B.
        2. Length of the subarray must be odd and the sum of all the elements of the subarray must be greater than B.
        Your task is to find the count of good subarrays in A.

        Problem Constraints
        1 <= len(A) <= 103
        1 <= A[i] <= 103
        1 <= B <= 107

        Input Format
        The first argument given is the integer array A.
        The second argument given is an integer B.

        Example Input
        Input 1:
        A = [1, 2, 3, 4, 5]
        B = 4
        Input 2:

        A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
        B = 65

        Example Output
        Output 1:         6
        Output 2:         36

        Example Explanation
        Explanation 1:
        Even length good subarrays = {1, 2}
        Odd length good subarrays = {1, 2, 3}, {1, 2, 3, 4, 5}, {2, 3, 4}, {3, 4, 5}, {5}

        */

package com.March.Arrays;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Good_SubArrays {

    public int solve(ArrayList<Integer> A, int B) {

        int sum, ans = 0;

        for (int i = 1; i < A.size(); i++) {
            A.set(i, A.get(i) + A.get(i - 1));
        }

        for (int i = 0; i <= A.size(); i++) {

            for (int j = i; j < A.size(); j++) {

                if (i > 0)
                    sum = A.get(j) - A.get(i - 1);
                else
                    sum = A.get(j);

                if (((j-i) % 2 == 0) && (sum > B))
                    ans++;
                else if (((j-i) % 2 != 0) && (sum < B))
                    ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss.SSS");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        Good_SubArrays obj = new Good_SubArrays();

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
