package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Odd_Even_Equal {

    public int solve(ArrayList<Integer> A) {

        ArrayList<Integer> xe = new ArrayList<>();
        ArrayList<Integer> yo = new ArrayList<>();

        for (int i=0; i<A.size(); i++) {

            if (i == 0) {
                xe.add(A.get(0));
                yo.add(0);
            }

            else if (i == 1) {
                yo.add(A.get(i));
                xe.add(xe.get(i-1));
            }

            else {

                if (i % 2 == 0) {
                    yo.add(yo.get(i - 1));
                    xe.add(A.get(i) + xe.get(i - 1));
                }

                else {
                    xe.add(xe.get(i - 1));
                    yo.add(A.get(i) + yo.get(i - 1));
                }
            }
        }

        int k =0, e_sum, o_sum, ans=0;
        int n = A.size()-1;

        while (k < A.size()) {

            e_sum = 0; o_sum=0;

            if (k==0) {
                e_sum = yo.get(n);
                o_sum = xe.get(n) - xe.get(k);
            }

            if (k % 2 == 0) {
                if (k == n) {
                    e_sum = xe.get(n - 1);
                    o_sum = yo.get(n);
                }
            }

            else {
                if (k == n) {
                    e_sum = xe.get(n);
                    o_sum = yo.get(n - 1);
                }
            }

            if ((k > 0) && (k !=n)) {
                e_sum = xe.get(k-1) + yo.get(n) - yo.get(k);
                o_sum = yo.get(k-1) + xe.get(n) - xe.get(k);
            }

            if (o_sum == e_sum) ans++;
            k++;
        }
        return ans;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        Odd_Even_Equal obj = new Odd_Even_Equal();

        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }

        System.out.println(obj.solve(A));
    }
}
