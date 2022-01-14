package com.january;

import java.util.Scanner;

public class StairPattern {
    public static void main(String[] args) {
        Scanner ReadUserInput = new Scanner(System.in);
        int PatternCount = ReadUserInput.nextInt();
        int LineNo = 1;
        char Alphabet = '*';
        while (LineNo <= PatternCount) {
            int Count = 1;
            while (Count <= LineNo) {
                if (Count == LineNo) {
                    System.out.println(Alphabet);
                } else {
                    System.out.print(Alphabet);
                }
                Count += 1;
            }
            LineNo += 1;
        }
    }
}
