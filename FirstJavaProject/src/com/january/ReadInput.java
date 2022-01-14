package com.january;
import java.util.Scanner;

public class ReadInput {
    public static void main(String[] args) {
        Scanner ReadNum = new Scanner(System.in);
        int CountNo = ReadNum.nextInt();
        int Digit;

        for(int i=0; i < CountNo; i++) {
            int Num = ReadNum.nextInt();
            int SumDigits = 0;
            while (Num > 0) {
                Digit = (Num % 10);
                SumDigits = SumDigits + Digit;
                Num = Num / 10;
            }
            System.out.println(SumDigits);
        }
    }
}
