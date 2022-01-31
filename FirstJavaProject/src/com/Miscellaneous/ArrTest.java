package com.Miscellaneous;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrTest {
    static ArrayList<Integer> binsrch(ArrayList<Integer> A) {
        ArrayList<Integer> C = new ArrayList<>();
        int s, e, mid, ans = 0;

        for (int i =0; i<A.size(); i++) {
            s = i; e = A.size()-1;
            while (s <= e) {
                mid = s + ((e - s) / 2);
                if (A.get(mid) > A.get(i)) {
                    e = mid - 1;
                }
                else if (A.get(mid) < A.get(i)) {
                    s = mid + 1;
                }
                else  {
                    ans = mid;
                    s = mid + 1;
                }
            }
            C.add(ans-i +1);
            i = ans;
        }
        return C;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        ArrayList<Integer> C;

        for (int i =0; i<n; i++) {
            A.add(sc.nextInt());
        }
        C = binsrch(A);
        for (int i : C) System.out.print(i + " ");
    }
}
