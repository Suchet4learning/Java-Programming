package com.january;

import java.util.Scanner;

public class InvNumPyramid {
    public static void main(String[] args) {
        Scanner PyramidSize = new Scanner(System.in);
        int PyLevels = PyramidSize.nextInt();
        int LineNo = 0;
        while (LineNo < PyLevels) {
            int Count = 1;
            while (Count <= (PyLevels - LineNo)) {
                if (Count == (PyLevels -LineNo)) {
                    System.out.println(Count);
                }
                else {
                    System.out.print(Count + " ");
                }
                Count += 1;
            }
            LineNo += 1;
        }
    }
}
