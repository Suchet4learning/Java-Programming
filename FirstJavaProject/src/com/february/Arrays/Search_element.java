package com.february.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Search_element {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // The number of Array and element pairs
        int n = sc.nextInt();
        char find;

        // Repeat till all the test cases have been completed.
        for (int i=0; i < n; i++) {
            find = 'N';

            // Get the size of array for each test case
            int m = sc.nextInt();
            int [] A = new int[m];

            // Populate all elements of the array
            for (int j =0; j<m; j++) {
                A[j] = sc.nextInt();
            }

            // Get the element to be searched in the array.
            int B = sc.nextInt();

            // Search if the element is present in the array.
            for (int k=0; k<A.length;k++) {
                if (A[k] == B) {
                    find = 'Y';
                    break;
                }
            }

            // If element is found in the Array return 1 else return 0.
            if (find == 'Y') {
                System.out.println(1);
            }
            else {
                System.out.println(0);
            }
        }
    }
}
