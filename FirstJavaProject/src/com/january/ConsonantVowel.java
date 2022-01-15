package com.january;

import java.util.Scanner;

public class ConsonantVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char var = sc.next().charAt(0);

        if (var == 'a') {
            System.out.println("1");
        }
        else if (var == 'e') {
            System.out.println("1");
        }
        else if (var == 'i') {
            System.out.println("1");
        }
        else if (var == 'o') {
            System.out.println("1");
        }
        else if (var == 'u') {
            System.out.println("1");
        }
        else {
            System.out.println("0");
        }
    }
}
