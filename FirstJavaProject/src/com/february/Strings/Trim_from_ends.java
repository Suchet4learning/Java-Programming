package com.february.Strings;

import java.util.Scanner;

public class Trim_from_ends {

    public String solve(String A) {
        int s = 0, str_len = A.length()-1;
        int i;

        while(A.charAt(s) == '*') {
            if (((str_len - s) == 0)  && (A.charAt(s) == '*'))
                return A = "";
            else if (A.charAt(s) == '*') {
                s++;
            }
        }

        int e = str_len;

        while (A.charAt(e) == '*') {
            if (((str_len - s) == 0) && (A.charAt(e) == '*'))
                return A = "";
            else if (A.charAt(e) == '*') {
                e--;
            }
        }

        e++;

        return A.substring(s,e);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Trim_from_ends obj = new Trim_from_ends();
        System.out.println(obj.solve(S));
    }
}
