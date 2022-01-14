package com.january;

import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner ReadUserInput = new Scanner(System.in);
        int PatternCount = ReadUserInput.nextInt();
        int LineNo = 1;
        while (LineNo <= PatternCount) {
            int Count = 1;
            while (Count <= LineNo) {
                if (Count == LineNo) {
                    System.out.println(Count);
                } else {
                    System.out.print(Count + " ");
                }
                Count += 1;
            }
            LineNo += 1;
        }
    }
}
