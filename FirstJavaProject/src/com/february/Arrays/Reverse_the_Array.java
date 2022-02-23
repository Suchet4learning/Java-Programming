package com.february.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reverse_the_Array {

    public ArrayList<Integer> solve(final List<Integer> A) {

        ArrayList<Integer> B = new ArrayList<>();
        int temp, j = A.size()-1;


        // iterate only half the array to reversing the array. Swap the corresponding index elements.
        for (int i=A.size()-1; i>=0; i--) {
            B.add(A.get(i));
        }

        //typecast the list to dynamic array list.
        return B;
    }

    public static void main(String[] args) {

        List<Integer> A = new ArrayList<>();
        Reverse_the_Array obj = new Reverse_the_Array();

        // Get the number of Array elements.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Read and store the elements of the Array.
        for (int i=0; i<n; i++) {
            A.add(sc.nextInt());
        }

        // Call the method to reverse the Array.
        A = obj.solve(A);

        // print out the reversed array.
        for (int k: A)
        System.out.print(k + " ");

    }
}
