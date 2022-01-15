package com.january;

import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Marks = 0;
        int n = 1;

        while (n <= 5) {
            Marks = Marks + sc.nextInt();
            n = n +1;
        }
        if(Marks > 0) {
            Marks = (Marks / (n - 1));
        }

        if (Marks >= 90) {
            System.out.println("Grade A");
        } else if (Marks >= 80) {
            System.out.println("Grade B");
        } else if (Marks >= 70) {
            System.out.println("Grade C");
        } else if (Marks >= 60) {
            System.out.println("Grade D");
        } else if (Marks >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}
