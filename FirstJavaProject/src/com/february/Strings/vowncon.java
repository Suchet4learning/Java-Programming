package com.february.Strings;

import java.util.Scanner;

public class vowncon {

    public static void parse_vowel(String S) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String S;
        int vow, cons;

        for (int i=0; i<n; i++) {
            S = sc.next(); vow =0; cons=0;
            for (int j = 0; j < S.length(); j++) {
                if (S.charAt(j) == 'a' || S.charAt(j) == 'e' || S.charAt(j) == 'i' || S.charAt(j) == 'o' || S.charAt(j) == 'u') {
                    vow = vow + 1;
                } else {
                    cons = cons + 1;
                }
            }
            System.out.println(vow + " " + cons);
        }
    }
}
