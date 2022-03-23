/*
Problem Description
Given an array of size N, find the majority element. The majority element is the element that appears more than floor(n/2) times.
You may assume that the array is non-empty and the majority element always exists in the array.

Problem Constraints
1 <= N <= 5*105
1 <= num[i] <= 109

Input Format
Only argument is an integer array.

Output Format
Return an integer.

Example Input
[2, 1, 2]

Example Output
2

Example Explanation
2 occurs 2 times which is greater than 3/2.
 */

package com.March.Day37;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Majority_Element {

    public int majorityElement(final List<Integer> A) {

        int max = A.get(0), count = 1;

        for (int i=1; i<A.size(); i++) {

            if (count != 0) {
                if (A.get(i) == max) {
                    count++;
                } else {
                    count--;
                    if (count == 0) {
                        max = 0;
                    }
                }
            }
            else {
                max = A.get(i);
                count++;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> a = new ArrayList<>();
        Majority_Element obj = new Majority_Element();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        System.out.println(obj.majorityElement(a));
    }

}
