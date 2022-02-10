package com.february.exercises;

import java.util.Scanner;

public class Area_of_Circle {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int area;

        area = (int)Math.ceil((Math.PI * n * n));
        System.out.println(area);

    }
}

