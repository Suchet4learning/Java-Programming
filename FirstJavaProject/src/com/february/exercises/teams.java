package com.february.exercises;

import java.util.Scanner;

public class teams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int CZ = 0, count = 0, i = 0, CO = 0;

        while (i < s.length()) {
            if (s.charAt(i) == '0') CZ++;
            else CO++;

            if (CZ == CO) count++;

            i++;
        }
        System.out.println(count);
    }
}
