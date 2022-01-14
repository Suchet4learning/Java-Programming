package com.january;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner MathTable = new Scanner(System.in);
        int Num = MathTable.nextInt();
        int count = 1;

        do {
            System.out.println(Num + " " + "*" + " " + count + " " + "=" + " " + Num*count);
            count += 1;
        } while(count <= 10);
    }
}
