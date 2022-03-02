package com.March.Arrays;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Max_Sub_comp {

    public int maxSubArray(int A, int B, ArrayList<Integer> C) {

        int sum, max = 0;
        //ArrayList<Integer> D = new ArrayList<>(A);

        //System.out.println(B);

        for (int i = 1; i < C.size(); i++) {
            C.set(i, C.get(i) + C.get(i - 1));
        }
        //System.out.println(A);

        for (int i = 0; i < C.size(); i++) {
            for (int j = i; j < C.size(); j++) {

                if (i > 0)
                    sum = C.get(j) - C.get(i - 1);
                else
                    sum = C.get(j);

                if ((sum > max) && (sum <= B)) max = sum;

            }
        }
        return max;
    }


    public static void main(String[] args) {

        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss.SSS");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Max_Sub_comp obj = new Max_Sub_comp();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }
        //Date dt = new Date();
        //System.out.println(fmt.format(dt));
        System.out.println(obj.maxSubArray(n,b,a));
        //dt = new Date();
        //System.out.println(fmt.format(dt));

    }

}
