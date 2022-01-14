package com.january;

import java.util.Scanner;

public class ReverseNumEasy {
    public static void main(String[] args) {
        Scanner UsrInp = new Scanner(System.in);
        int t = UsrInp.nextInt();

        while(t > 0) {
            t -= 1;
            int n, rev = 0;
            n = UsrInp.nextInt();
             while (n > 0) {
                 rev = ((rev * 10) + (n % 10));
                 n = n / 10;
             }
            System.out.println(rev);
        }
    }
}
