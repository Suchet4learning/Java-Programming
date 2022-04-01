/*
Problem Description
Shaggy has an array A consisting of N elements. We call a pair of distinct indices in that array a special if elements at those indices in the array are equal.
Shaggy wants you to find a special pair such that the distance between that pair is minimum. Distance between two indices is defined as |i-j|. If there is no special pair in the array, then return -1.

Problem Constraints
1 <= |A| <= 105

Input Format
The first and only argument is an integer array A.

Output Format
Return one integer corresponding to the minimum possible distance between a special pair.

Example Input
Input 1:
A = [7, 1, 3, 4, 1, 7]
Input 2:
A = [1, 1]

Example Output
Output 1:
 3
Output 2:
 1

Example Explanation
Explanation 1:
Here we have 2 options:
1. A[1] and A[4] are both 1 so (1,4) is a special pair and |1-4|=3.
2. A[0] and A[5] are both 7 so (0,5) is a special pair and |0-5|=5.
Therefore the minimum possible distance is 3.

Explanation 2:
Only possibility is choosing A[1] and A[2].
 */

package com.March.Day40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Shaggy_and_distances {

    public int solve(ArrayList<Integer> A) {
        int ans=Integer.MAX_VALUE;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<A.size(); i++) {
            if (map.containsKey(A.get(i))) {
                if (i-map.get(A.get(i)) < ans) {
                    ans = i - map.get(A.get(i));
                }
            }
            else {
                map.put(A.get(i),i);
            }
        }
        if (ans == Integer.MAX_VALUE) {
            ans=-1;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();
        Shaggy_and_distances obj = new Shaggy_and_distances();
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        System.out.println(obj.solve(a));
    }
}
