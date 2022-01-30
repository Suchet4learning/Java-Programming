package com.january.arrays;

import java.util.Scanner;

public class sqrootbinsearch {

    static int sqrtbin(int n) {
        int s = 0, e = n, i = 1;
        int mid, ans = 0;

        while (s<=e) {
            mid = (s+e)/2;
            if (mid*mid<=n) {
                ans = mid;
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(sqrtbin(n));
    }
}
