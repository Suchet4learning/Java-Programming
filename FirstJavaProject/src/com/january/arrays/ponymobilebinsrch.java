package com.january.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ponymobilebinsrch {
    static ArrayList<Integer> solve(ArrayList<Integer> A, ArrayList<Integer> B) {
        ArrayList <Integer> C = new ArrayList<>();
        int s, e, mid, pos=0, j, ans, amt, count;

        for (int i=0; i< B.size(); i++) {
            amt = B.get(i); ans = 0; j=0;
            while (j<A.size() && amt > 0) {
                s = j; e = A.size()-1;
                count = 0;

                while(s<=e) {
                    mid = s + ((e-s) / 2);
                    if (A.get(mid) > A.get(j)) {
                        e = mid - 1;
                    } else if (A.get(mid) < A.get(j)) {
                        s = mid + 1;
                    } else {
                        pos = mid;
                        s = mid + 1;
                    }
                }
                count = (pos - j) + 1;
                while (((amt / (count * A.get(pos))) < 1) && (count > 1)) {
                    count--;
                }
                if (amt - (count * A.get(pos)) >= 0) {
                    amt = amt - count * A.get(pos);
                    ans = ans + count;
                }
                j = pos + 1;
            }
            C.add(ans);
        }
        return C;
    }

    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> B = new ArrayList<>();
        ArrayList<Integer> C;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }
        n = sc.nextInt();
        for (int i=0; i<n; i++) {
            B.add(sc.nextInt());
        }
        C = solve(A,B);
        System.out.println(C);
    }
}
