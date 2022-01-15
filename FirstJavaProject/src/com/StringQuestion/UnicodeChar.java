package com.StringQuestion;

import java.util.Scanner;

public class UnicodeChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Value = sc.nextLine();
        int Ch;
        System.out.println("The string entered by the user is: " + Value);
        int Pos = sc.nextInt();
        Ch = Value.codePointAt(Pos);
        System.out.println("The Unicode of character " + Value.charAt(Pos) + " at position " + Pos + " is : " + Ch);
        Pos = sc.nextInt();
        Ch = Value.codePointAt(Pos);
        System.out.println("The Unicode of character " + Value.charAt(Pos) + " at position " + Pos + " is : " + Ch);

    }
}
