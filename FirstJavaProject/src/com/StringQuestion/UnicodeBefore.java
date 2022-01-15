package com.StringQuestion;

import java.util.Scanner;

public class UnicodeBefore {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String Inp = sc.nextLine();

        int Start = sc.nextInt();
        int End = sc.nextInt();

        System.out.println("The unicode value of character before " + Inp.charAt(Start) + " is : " + Inp.codePointBefore(Start));
        System.out.println("The unicode value of character before " + Inp.charAt(End) + " is : " + Inp.codePointBefore(End));
        System.out.println("Codepoint Count is : " + Inp.codePointCount(Start, End));
    }
}
