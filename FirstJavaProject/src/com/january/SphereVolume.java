package com.january;

import java.util.Scanner;

public class SphereVolume {
    public int solve(final int R)
    {
        return (int)(Math.ceil((((4 * Math.PI) * (R * R * R))/3)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Rad = sc.nextInt();
        SphereVolume Shape = new SphereVolume();
        System.out.println(Shape.solve(Rad));
    }
}
