package com.Miscellaneous;

import java.util.Scanner;

public class VowelSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int len = A.length();
        int i = 0;

        while(i < len) {
            if (A.charAt(i) == 'a') {
                System.out.print(A.charAt(i));
            }
            else if(A.charAt(i) =='e') {
                System.out.print(A.charAt(i));
            }
            else if(A.charAt(i) =='i') {
                System.out.print(A.charAt(i));
            }
            else if(A.charAt(i) =='o') {
                System.out.print(A.charAt(i));
            }
            else if(A.charAt(i) =='u') {
                System.out.print(A.charAt(i));
            }
            i+=1;
        }
    }
}
