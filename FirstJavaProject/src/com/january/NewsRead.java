package com.january;

import java.util.ArrayList;
import java.util.Scanner;

public class NewsRead {
    public static int solve(int A, ArrayList<Integer> B) {
        int Sum = 0, i = 0;
        while (i<B.size())  {
            Sum = Sum + B.get(i);
            i++;
            if (Sum >= A) break;
            if (i==B.size()) {
                if (A % Sum !=0) {
                        i = 0;
                        A = A % Sum;
                        Sum = 0;
                }
                else if (Sum == 1) {
                    i = 0;
                    A = A - Sum;
                }
                else break;
            }
        }
        return (i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        ArrayList<Integer> Arr = new ArrayList<>();

        for (int j=0; j<i; j++) {
            Arr.add(sc.nextInt());
        }
        System.out.println(solve(n,Arr));

    }
}
