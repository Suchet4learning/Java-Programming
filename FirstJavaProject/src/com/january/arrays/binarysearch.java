package com.january.arrays;

import java.util.Scanner;

public class binarysearch {
    static int findoccur(int[] sort_arr, int Key) {
        int start = 0, mid;
        int end = sort_arr.length-1;
        int first = -1;

                while(start <= end) {
                    mid = ((start + end) / 2);
                    if (sort_arr[mid] > Key) {
                        end = mid - 1;
                    }
                    else if (sort_arr[mid] < Key) {
                        start = mid + 1;

                    }
                    else {
                        return mid;
                    }
                }
                return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Key = sc.nextInt();
        int[] sort_arr = {1,3,5,7,16,20,24,28};
        int num = findoccur(sort_arr,Key);
        if (num >= 0) {
            System.out.println("The element is found at position " + num);
        }
        else {
            System.out.println("The element has not been found.");
        }
    }
}
