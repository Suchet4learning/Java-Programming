package com.january.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class AdjacentArray {

        public static void main(String[] args) {
            ArrayList<Integer> Num = new ArrayList<>();
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int count = 0, n1, n2;
            n1 = sc.nextInt();
            Num.add(n1);

            for (int i=1; i<n; i++) {
                n2 = sc.nextInt();
                if (((n1 + n2) % 2) ==0) {
                    Num.add(n2);
                    n1 = n2;
                }
                else {
                    count = count + 1;
                }
            }
            System.out.println(count);
        }
}
