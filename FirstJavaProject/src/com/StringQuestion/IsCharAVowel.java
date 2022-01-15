package com.StringQuestion;

import java.util.Scanner;

public class IsCharAVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Inp = sc.nextLine();
        char Ch = Inp.charAt(0);

        if (Ch == 'a' || Ch == 'e' || Ch == 'i' || Ch == 'o' || Ch == 'u') {
            System.out.println(Ch + " is a vowel.");
        }
        else {
            System.out.println(Ch + " is not a vowel.");
        }

    }
}
