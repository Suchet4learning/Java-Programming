package com.March.Arrays;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class Subarr_least_avg {

    public int solve(ArrayList<Integer> A, int B) {

        int sum, ans = -1, min = Integer.MAX_VALUE;

        for (int i = 1; i < A.size(); i++) {
            A.set(i, A.get(i) + A.get(i - 1));
        }

        for (int i = 0; i <= A.size()-B; i++) {
            sum = 0;
            for (int j = i; j < i+B; j++) {

                if (i > 0)
                    sum = A.get(j) - A.get(i - 1);
                else
                    sum = A.get(j);
            }

            if (sum < min) {
                min = sum;
                ans = i;
            }
        }
        return ans;
    }


    public static void main(String[] args) {

        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss.SSS");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> a = new ArrayList<>();
        Subarr_least_avg obj = new Subarr_least_avg();

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
