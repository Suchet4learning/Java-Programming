package com.february.Strings;

import java.util.Scanner;

public class Low_to_high {

    public String solve(String A) {
        int Abet = 65, val;
        String S = "";
        for (int i=0; i<A.length(); i++) {
            if (((int)A.charAt(i) >= 97) && ((int)A.charAt(i) <= 122)) {
                int num = ((int)A.charAt(i) % 97);
                val = Abet + num;
                S = S + (char)val;
            }
            else {
                S = S + A.charAt(i);
            }
        }
        return S;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        Low_to_high obj = new Low_to_high();
        System.out.println(obj.solve(S));

    }
}
