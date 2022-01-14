package com.january;

import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner ReadUserInput = new Scanner(System.in);
        int PatternCount = ReadUserInput.nextInt();
        int LineNo = 1;
        char[] Alphabet = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        while (LineNo <= PatternCount) {
            int Count = 1;
            while (Count <= LineNo) {
                if (Count == LineNo) {
                    System.out.println(Alphabet[LineNo - 1]);
                } else {
                    System.out.print(Alphabet[LineNo - 1] + " ");
                }
                Count += 1;
            }
            LineNo += 1;
        }
    }
}
