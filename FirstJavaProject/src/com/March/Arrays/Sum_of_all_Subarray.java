package com.March.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Sum_of_all_Subarray {

    public Long subarraySum(ArrayList<Integer> A) {

        long sum = 0L;
        int rem;
        int n = A.size();

        for (int i=0; i<A.size(); i++) {
            rem = (i + 1) * (n - i) * A.get(i);
            sum = sum + rem;
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> x = new ArrayList<>();
        Sum_of_all_Subarray obj = new Sum_of_all_Subarray();

        for(int i=0; i<n; i++) {
            x.add(sc.nextInt());
        }

        System.out.println(obj.subarraySum(x));

    }
}
