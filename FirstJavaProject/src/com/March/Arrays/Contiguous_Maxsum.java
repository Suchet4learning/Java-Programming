/*
Problem Description
Find the contiguous non empty subarray within an array, A of length N which has the largest sum.

Problem Constraints
1 <= N <= 1e6
-1000 <= A[i] <= 1000

Input Format
The first and the only argument contains an integer array, A.

Output Format
Return an integer representing the maximum possible sum of the contiguous subarray.

Example Input
Input 1:

 A = [1, 2, 3, 4, -10]
Input 2:

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

Example Output
Output 1: 10
Output 2: 6

Example Explanation
Explanation 1:

 The subarray [1, 2, 3, 4] has the maximum possible sum of 10.
Explanation 2:

 The subarray [4,-1,2,1] has the maximum possible sum of 6.

 */

package com.March.Arrays;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Contiguous_Maxsum {

    public int maxSubArray(final List<Integer> A) {

        int sum, max = Integer.MIN_VALUE;

        for (int i=0; i<A.size(); i++) {
            sum = 0;
            for (int j=i; j<A.size(); j++) {
                sum = sum + A.get(j);
                if (sum > max) max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss.SSS");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        Contiguous_Maxsum obj = new Contiguous_Maxsum();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        /*
        Date dt = new Date();
        System.out.println(fmt.format(dt));
        */

        System.out.println(obj.maxSubArray(a));

        /*
        dt = new Date();
        System.out.println(fmt.format(dt));
        */

    }

}
