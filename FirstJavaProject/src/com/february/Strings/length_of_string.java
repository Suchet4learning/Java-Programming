package com.february.Strings;

import java.util.Scanner;

public class length_of_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i=0; i<T; i++) {
            System.out.println(sc.next().length());
        }
    }
}
