package com.january;

import javax.sound.sampled.Line;
import java.util.Scanner;

public class NumPyramid {
    public static void main(String[] args) {
        Scanner UsrInp = new Scanner(System.in);
        int Level = UsrInp.nextInt();
        int LineNo;
        int count;
        int Pos = Level;
        int Cols = (2 * Level) - 1;

        for (int i = 1; i <= Level; i++) {
            count = 1;
            LineNo = i;
            while(count <= Level) {
                if (count < Pos) {
                    System.out.print("0 ");
                }
                else if (count > Pos) {
                    LineNo += 1;
                    System.out.print(LineNo + " ");
                }
                else {
                    System.out.print(LineNo + " ");
                }
                count += 1;
            }
             while (count <= Cols) {
                 if ((Level - i) > 0) {
                     if ((count + (Level-i)) <= Cols ) {
                         LineNo -= 1;
                         System.out.print(LineNo + " ");
                     }
                     else {
                         System.out.print("0 ");
                     }
                 }
                 else if ((Level - i) == 0) {
                     LineNo -= 1;
                     System.out.print(LineNo + " ");
                 }
                 count += 1;
            }
            System.out.println();
            Pos -= 1;
        }
    }
}
