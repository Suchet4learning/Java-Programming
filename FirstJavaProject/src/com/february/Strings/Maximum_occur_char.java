package com.february.Strings;

import java.util.Scanner;

public class Maximum_occur_char {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int pos, count, Max=0;
        char ch = ' ';
        for (int j=0; j<S.length();j++) {
            pos = j; count =0;
            while (pos > -1) {
                pos = S.indexOf(S.charAt(j), pos);
                if (pos > -1) {
                    count += 1;
                    pos += 1;
                }
            }
            if (count > Max) {
                Max = count;
                ch = S.charAt(j);
            }
        }
        System.out.println("The character " + ch + " appears the most number of times - " + Max + " times in the string");
    }
}
