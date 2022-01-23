package com.january.recursion;

import java.util.Scanner;

public class TowerofHanoi {

    public static void toh(int n, char Src, char Help, char Dest) {
        if (n==0) return;
            toh(n - 1, Src, Dest, Help);
            System.out.println("move Disk - " + n + " from " + Src + " to " + Dest);
            toh(n - 1, Help, Src, Dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char Src = 'A', Help ='B', Dest = 'C';
        toh(n, Src, Help, Dest);
    }

}
