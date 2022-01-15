package com.StringQuestion;

import java.util.Scanner;

public class UnicodeBefore {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String Inp = sc.nextLine();

        int Pos = sc.nextInt();
        System.out.println("The unicode value of character before " + Inp.charAt(Pos) + " is : " + Inp.codePointBefore(Pos));

        Pos = sc.nextInt();
        System.out.println("The unicode value of character before " + Inp.charAt(Pos) + " is : " + Inp.codePointBefore(Pos));

    }
}
