package com.March.Arrays;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Maxsum_SubA_Opt {

    public int maxSubArray(final ArrayList<Integer> A) {

        int sum, max = Integer.MIN_VALUE;
        ArrayList<Integer> B = new ArrayList<>();

        for (int i=0; i<A.size(); i++) {
            sum = 0;
            for (int j=i; j<A.size(); j++) {

                sum = sum + A.get(j);

                if(i<1) {
                    B.add(sum);
                }
                else {
                    sum = B.get(j) - B.get(i-1);
                }
                if (sum > max) max = sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {

        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss.SSS");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        Maxsum_SubA_Opt obj = new Maxsum_SubA_Opt();

        for (int i=0; i<n; i++) {
            a.add(sc.nextInt());
        }

        Date dt = new Date();
        System.out.println(fmt.format(dt));
        System.out.println(obj.maxSubArray(a));
        dt = new Date();
        System.out.println(fmt.format(dt));
    }

}
