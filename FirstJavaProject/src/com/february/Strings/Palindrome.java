package com.february.Strings;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s, rs;

        for (int i=0; i<n; i++) {
            s = sc.next(); rs = "";
            for (int j=s.length()-1; j>=0; j--) {
                rs = rs + s.charAt(j);
            }
            if (s.equalsIgnoreCase(rs)) {
                System.out.println("1 ");
            }
            else {
                System.out.println("0 ");
            }
        }
    }
}
