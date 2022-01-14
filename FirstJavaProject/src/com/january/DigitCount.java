package com.january;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner UsrInp = new Scanner(System.in);
        int Count = UsrInp.nextInt();
        int Num, Digit, i;

        for(i = 0; i < Count; i++) {
            Digit = 1;
            Num = UsrInp.nextInt();
            while((Num / 10) > 0) {
                Digit += 1;
                Num = Num / 10;
            }
            System.out.println(Digit);
        }
    }
}
