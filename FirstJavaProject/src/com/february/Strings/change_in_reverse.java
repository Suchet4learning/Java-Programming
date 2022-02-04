package com.february.Strings;

import java.util.Scanner;

public class change_in_reverse {

    public int countRev(String A) {
        String Revs = "";
        int diff=0, j=0;
        for (int i=A.length()-1; i>=0; i--) {
            Revs = Revs + A.charAt(i);
            if (A.charAt(j) != A.charAt(i)) {
                diff++;
            }
            j++;
        }

        /* for (int i=0; i<A.length(); i++) {
            if (A.charAt(i) != Revs.charAt(i)) {
                diff++;
            }
        } */
        return diff;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        change_in_reverse obj = new change_in_reverse();
        System.out.println(obj.countRev(s));

    }
}
