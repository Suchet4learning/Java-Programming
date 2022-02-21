package com.february.exercises;

import java.util.Scanner;

public class Pony_Dony_Game {

    public String solve(int A) {
        String Winner;

        if (A==2) {
            Winner = "Donny";
        }
        else {
            Winner = "Ponny";
        }

        return Winner;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Pony_Dony_Game obj = new Pony_Dony_Game();
        System.out.println(obj.solve(n));
    }
}
