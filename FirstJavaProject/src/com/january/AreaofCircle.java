package com.january;

import java.util.Scanner;

public class AreaofCircle {
    public static int GetArea(int Radius) {
        return (int) Math.ceil(Math.PI * Radius * Radius);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int Rad = sc.nextInt();
        System.out.println(GetArea(Rad));
    }
}
