package com.february.Strings;

import java.util.Scanner;

public class Reverse_words_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next(), revString ="";
        int end = S.length();
        int str = 0;
        for (int i=S.length()-1; i>=0; i--) {
            if ((S.charAt(i) == '.') || (i==0)) {
                if (i>0) {
                    str = i+1;
                }
                else if (i==0) {
                    str = 0;
                }
                revString = revString + S.substring(str,end);
                if (str > 0) {
                    revString = revString + '.';
                    end = str - 1;
                }
            }
        }
        System.out.println(revString);
    }
}
