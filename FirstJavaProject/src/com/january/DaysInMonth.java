package com.january;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner UsrData = new Scanner(System.in);
        int Index = UsrData.nextInt();
        int[] CalMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (Index > 0 && Index <= 12) {
            System.out.println(CalMonth[Index - 1]);
        }
    }
}
