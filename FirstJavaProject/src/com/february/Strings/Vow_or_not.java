package com.february.Strings;

import java.util.Scanner;

public class Vow_or_not {

    public static int isvowel(char c) {

        if (c == 'a' ||
                c == 'e' ||
                c == 'i' ||
                c == 'o' ||
                c == 'u')
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String C = sc.next();
        char ch = C.charAt(0);
        System.out.println(isvowel(ch));

    }
}
