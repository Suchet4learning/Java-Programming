package com.StringQuestion;

import java.util.Scanner;

public class GetIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String New = sc.nextLine();
        System.out.println("The input string is: " + New);

        int Pos = sc.nextInt();
        System.out.println("The character at position " + Pos + " is: " + New.charAt(Pos));

        Pos = sc.nextInt();
        System.out.println("The character at position " + Pos + " is: " + New.charAt(Pos));
    }
}
