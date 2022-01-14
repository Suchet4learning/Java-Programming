package com.january;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner UsrInp = new Scanner(System.in);
        int PNum = UsrInp.nextInt();
        int i = 2;
        int Div;
        char PN;

        while (i <= PNum) {
            Div = 1;
            PN = 'N';
            while ((Div * Div) <= i) {
                if (((i % Div) == 0) && (Div > 1))  {
                    PN = 'N';
                    break;
                }
                else {
                    PN = 'Y';
                }
                Div += 1;
            }
            if (PN == 'Y') {
                System.out.println(i);
            }
            i += 1;
        }
    }
}
