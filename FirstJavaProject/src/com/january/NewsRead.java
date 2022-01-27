package com.january;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NewsRead {

    public int solve(int A, ArrayList<Integer> B) {
        int sum = 0, i;
        for (i=0; i<B.size(); i++) {
            sum = sum + B.get(i);
            if (sum >= A) {
                return (i+1);
            }
        }
        if (sum > 1) {
            if ((A % sum)==0) {
               A = sum;
            }
            else {
                A = (A % sum);
            }
            sum = 0;
        }
        else {
            sum = ((A-1) / sum);
        }
        for (i=0; i<B.size(); i++) {
            sum = sum + B.get(i);
            if (sum >= A) {
                return (i+1);
            }
        }
        return (i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        ArrayList<Integer> Arr = new ArrayList<>();
        int Sum =0;
        NewsRead obj = new NewsRead();

        for (int j=0; j<i; j++) {
            Arr.add(sc.nextInt());
        }
        System.out.println(obj.solve(n,Arr));
    }
}
