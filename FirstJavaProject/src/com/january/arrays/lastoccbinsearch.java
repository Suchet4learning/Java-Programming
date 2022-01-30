package com.january.arrays;

import java.util.Scanner;

public class lastoccbinsearch {

        static int last_occur(int[] sort_arr, int Key) {
            int s = 0, e = sort_arr.length - 1;
            int pos = -1, mid;

            while (s<=e) {
                mid = ((s + e) / 2);
                if (sort_arr[mid] > Key) {
                    e = mid - 1;

                }
                else if (sort_arr[mid] < Key){
                    s = mid + 1;
                }
                else {
                    pos = mid;
                    s = mid + 1;
                }
            }
            return pos;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            int[] bin_arr = {1,2,3,3,6,6,7,8,10,12};
            int n = last_occur(bin_arr,num);
            if (n > 0) {
                System.out.println("The last occurrence of the element is at position " + n);
            }
            else {
                System.out.println("The element has not been found in the array.");
            }
        }
}
