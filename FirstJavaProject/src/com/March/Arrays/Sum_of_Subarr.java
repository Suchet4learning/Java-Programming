/*
Problem Description
You are given an integer array A of length N.
You have to find the sum of all subarray sums of A.
More formally, a subarray is a defined as a contiguous part of an array,
which we can obtain by deleting zero or more elements from either end of the array.
A subarray sum denotes the sum of all the elements of that subarray.

Problem Constraints
1 <= N <= 105
1 <= Ai <= 10 4

Input Format
The first argument is the integer array A.

Output Format
Return a single integer denoting the sum of all subarray sums of the given array.

Example Input
Input 1:
A = [1, 2, 3]

Input 2:
A = [2, 1, 3]

Example Output
Output 1:20
Output 2:19

Example Explanation
Explanation 1:
The different subarrays for the given array are: [1], [2], [3], [1, 2], [2, 3], [1, 2, 3].
Their sums are: 1 + 2 + 3 + 3 + 5 + 6 = 20

Explanation 2:
Similiar to the first example, the sum of all subarray sums for this array is 19.
*/
package com.March.Arrays;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Sum_of_Subarr {

    public Long subarraySum(ArrayList<Integer> A) {

        long sum = 0L;
        long ans;

        int rem=0;
        int n = A.size();

        for (int i=0; i<A.size(); i++) {
            ans =  ((long)(i + 1) * (long)(n - i) * (long)A.get(i));
            sum = Long.sum(sum,ans);
        }
        return sum;
    }


    public static void main(String[] args) {

        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss.SSS");

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        Sum_of_Subarr obj = new Sum_of_Subarr();

        for(int i=0; i<n; i++) {
            x.add(sc.nextInt());
        }

        /* Date dt = new Date();
        System.out.println(fmt.format(dt)); */

        System.out.println(obj.subarraySum(x));

        /* dt = new Date();
        System.out.println(fmt.format(dt)); */

    }
}
