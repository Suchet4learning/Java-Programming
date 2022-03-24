/*
Problem Description
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.
If there are multiple solutions, return anyone.

Problem Constraints
1 <= N <= 7*105
1 <= A[i] <= 109

Input Format
The only argument is an integer array A.

Output Format
Return an integer.

Example Input
[1 2 3 1 1]

Example Output
1

Example Explanation
1 occurs 3 times which is more than 5/3 times.
 */
package com.March.Day37;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class N3_Repeat_Num {
    public int repeatedNumber(final List<Integer> a) {

        int count1 = 0, count2 = 0, n=a.size();

        int first =  Integer.MIN_VALUE;
        int second = Integer.MAX_VALUE;

        for (int i : a) {

            // if this element is previously seen, increment count.
            if (first == i)
                count1++;

                // if this element is previously seen, increment count.
            else if (second == i)
                count2++;

            else if (count1 == 0) {
                count1++;
                first = i;
            }

            else if (count2 == 0) {
                count2++;
                second = i;
            }

            // if current element is different from both the previously seen
            // variable, decrement the counts.
            else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;

        // find the actual counts.
        for (int i : a) {
            if (i == first)
                count1++;

            else if (i == second)
                count2++;
        }

        if (count1 > n / 3)
            return first;

        if (count2 > n / 3)
            return second;

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> A = new ArrayList<>();
        N3_Repeat_Num obj = new N3_Repeat_Num();

        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }
        System.out.println(obj.repeatedNumber(A));
    }
}
