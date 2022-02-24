package com.february.Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Little_Pony_Max_element {

    public int solve (ArrayList<Integer> A, int B) {
        int count=0;
        char isFound = 'N';

        for (int i: A) {
            if (i > B) {
                i = -1;
                count++;
            }
            if (i == B) isFound = 'Y';
        }

        if (isFound == 'N') return -1;

        return count;
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> A = new ArrayList<>();

        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }

        int B = sc.nextInt();

        Little_Pony_Max_element obj = new Little_Pony_Max_element();
        System.out.println(obj.solve(A,B));


    }
}
